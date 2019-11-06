package com.baizhi.service;

import com.baizhi.dao.AdminDAO;
import com.baizhi.entity.Admin;


import java.util.UUID;

public class AdminServiceImpl implements AdminService{
    private AdminDAO adminDAO;

    //管理员登录
    @Override
    public Admin login(String adminname, String adminpassword) {
        Admin a = adminDAO.queryAdmin(adminname,adminpassword);
       if(a==null)throw new RuntimeException("不是管理员");
       if (!a.getAdminname().equals(adminname)&&a.getAdminpassword().equals(adminpassword))throw new RuntimeException("用户错误哦");
        return a;
    }

    //管理员注册
    @Override
    public void modifyregister(Admin admin) {
        //id值set进去
        admin.setId(UUID.randomUUID().toString());
           adminDAO.registerAdmin(admin);
    }

    public void setAdminDAO(AdminDAO adminDAO) {
        this.adminDAO = adminDAO;
    }
}
