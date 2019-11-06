package com.baizhi.dao;

import com.baizhi.entity.Department;
import com.baizhi.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    //员工展示所有
    public List <Employee> queryAll(String employeedepartmentid);
    //查询要修改的ID
    public Employee queryEmployee(String id);
    //修改
    public void updateEmployee(Employee employee);
    //删除
    public void deleteEmployee(String id);
    //添加
    public void addEmployee(Employee employee);

    //ajax开发下拉列表
    public List<Department> selectAllDepartment();
    //通过修改之后部门ID的查询到部门名称
    public Department selectDepartment(String id);

}
