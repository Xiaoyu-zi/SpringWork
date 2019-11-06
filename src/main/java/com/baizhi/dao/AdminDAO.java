package com.baizhi.dao;

import com.baizhi.entity.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminDAO {
    //管理员登录
    public Admin  queryAdmin(@Param("adminname") String adminname, @Param("adminpassword") String adminpassword);
    //    // 注册
    public void registerAdmin(Admin admin);
}
