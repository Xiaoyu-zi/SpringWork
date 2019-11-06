package com.baizhi.service;

import com.baizhi.entity.Admin;

public interface AdminService {
    //注意记得要前面加入modify来控制事物
    //管理员登录
    public Admin login(String adminname, String adminpassword);
    //管理员注册
    public void modifyregister(Admin admin);

}
