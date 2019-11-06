package com.baizhi.service;

import com.baizhi.entity.Department;
import com.baizhi.entity.Employee;

import java.util.List;

public interface EmployeeService {
    //记得加
    //员工展示所有
    public List<Employee> queryAll(String employeedepartmentid);
    //查询要修改的ID
    public Employee queryEmployee(String id);
    //修改
    public void modifyupdateEmployee(Employee employee);
    //删除
    public void modifydeleteEmployee(String id);
    //添加
    public void modifyaddEmployee(Employee employee);


    //ajax开发
    public List<Department> selectAllDepartment();
}
