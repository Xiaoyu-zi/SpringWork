package com.baizhi.service;

import com.baizhi.entity.Department;

import java.util.List;

public interface DepartmentService {
    //注意记得要前面加入modify来控制事物
    //展示
    public List<Department> queryAll();
    //添加
    public void modifyaddDepartment(Department department);
    //通过ID查出来要修改的参数
    public Department queryDepartment(String id);
    //修改
    public void  modifyupdateDepartment(Department department);
}
