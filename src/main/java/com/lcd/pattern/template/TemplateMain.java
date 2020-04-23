package com.lcd.pattern.template;

import com.lcd.pattern.template.dao.MemberDao;
import com.lcd.pattern.template.empty.Member;

import java.util.List;

public class TemplateMain {
    public static void main(String[] args) {

        MemberDao memberDao = new MemberDao();
        List<Member> list = memberDao.selectAll();
        System.out.println(list);
    }
}
