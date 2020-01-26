package com.lcd.pattern.template;

import com.lcd.pattern.template.empty.Member;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    private void closeResultSet(ResultSet resultSet) throws Exception{
        resultSet.close();
    }
    private void closePreparedStatement(PreparedStatement ps) throws Exception{
        ps.close();
    }
    private void closeConnection(Connection conn) throws Exception{
        conn.close();
    }
    public List<?> executeQuery(String sql, RowMapper rowMapper ,Object[] params){
        try{
            //1.获取连接
            Connection conn = dataSource.getConnection();
            //2.创建语句集
            PreparedStatement ps = conn.prepareStatement(sql);
            //3.执行语句集，并且获得结果集
            ResultSet rs = ps.executeQuery();
            //4.解析语句集
            List<Object> list = new ArrayList<>();
            int rowNum = 1;
            while (rs.next()){
                list.add(rowMapper.mapRow(rs,rowNum++));
            }
            //5.关闭结果集
            closeResultSet(rs);
            //6.关闭语句集
            closePreparedStatement(ps);
            //7.关闭连接
            closeConnection(conn);
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
