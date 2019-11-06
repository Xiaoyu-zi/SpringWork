package com.baizhi.test;

import com.baizhi.dao.AdminDAO;
import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdminTest {
    @Test
    public void test1(){//管理员注册 DAO方法测试
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意接口首字母小写
        AdminDAO adminDAO = (AdminDAO) ac.getBean("adminDAO");
        adminDAO.registerAdmin(new Admin("2","测试管理员","真实姓名","123456","男"));
    }

    @Test
    public void test2(){//管理员注册 DAO方法测试
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意接口首字母小写
        AdminService adminService = (AdminService) ac.getBean("adminService");
        System.out.println(adminService.login("测试管理员","123456"));
    }
}
