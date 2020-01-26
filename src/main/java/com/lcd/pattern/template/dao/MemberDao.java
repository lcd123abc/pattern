package com.lcd.pattern.template.dao;

import com.lcd.pattern.template.JdbcTemplate;
import com.lcd.pattern.template.empty.Member;
import java.util.List;

public class MemberDao {
    private JdbcTemplate template = new JdbcTemplate(null);

    public List<Member> selectAll(){
        String sql = "select * from t_member";
        List<Member> list = (List<Member>)this.query(sql, null);
        return list;
    }

    public List<?> query(String sql, Object[] params){
        return template.executeQuery(sql, (rs,rowNum) -> {
            Member member = new Member();
            member.setUsername(rs.getString("username"));
            member.setPassword(rs.getString("password"));
            return member;
        }, params);
    }
}
