package com.baizhi.dao;

import com.baizhi.entity.Department;
import com.baizhi.entity.Employee;

import java.util.List;

public interface DepartmentDAO {
    //展示
    public List<Department> queryAll();
    //添加
    public void addDepartment(Department department);
    //通过ID查出来要修改的参数
    public Department queryDepartment(String id);
    //修改
    public void  updateDepartment(Department department);

   //通过部门Id查询
    public List<Employee> selectEmployee(String id);
}
