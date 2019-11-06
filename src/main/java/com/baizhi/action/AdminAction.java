package com.baizhi.action;

import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;

import javax.swing.*;

public class AdminAction {//已经从本地下载并且修改过
    //接收数据
    private Admin admin;
    private String adminname;
    private String adminpassword;
    private AdminService adminService;
    private String message;

//管理员登录
    public  String login(){
        //收参传参调用方法关闭事物

        try {
            adminService.login(adminname, adminpassword);
            return "success";
        }catch (Exception e){
            e.getMessage();
            return "error";
        }
        //跳转

    }

//管理员注册
    public String regsister(){
        adminService.modifyregister(admin);
        return "success";
    }







    public Admin getAdmin() {
        return admin;
    }
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    public String getAdminname() {
        return adminname;
    }
    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }
    public String getAdminpassword() {
        return adminpassword;
    }
    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }
    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
