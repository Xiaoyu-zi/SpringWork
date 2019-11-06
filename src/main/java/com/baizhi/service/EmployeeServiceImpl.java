package com.baizhi.service;

import com.baizhi.dao.EmployeeDAO;
import com.baizhi.entity.Department;
import com.baizhi.entity.Employee;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;

public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDAO employeeDAO;
    //查询所有的员工
    @Override
    public List<Employee> queryAll(String employeedepartmentid) {
        List<Employee> employees = employeeDAO.queryAll(employeedepartmentid);
        return employees;
    }

    //查询单个员工的信息
    @Override
    public Employee queryEmployee(String id) {
        Employee employee = employeeDAO.queryEmployee(id);
        return employee;
    }

    @Override
    public void modifyupdateEmployee(Employee employee) {
        //通过部门的查到之后加入
         Department department=employeeDAO.selectDepartment(employee.getEmployeedepartmentid());
         employee.setEmployeedepartmentname(department.getDepartmentname());
         employeeDAO.updateEmployee(employee);
    }

    @Override
    public void modifydeleteEmployee(String id) {
        employeeDAO.deleteEmployee(id);
    }

    @Override
    public void modifyaddEmployee(Employee employee) {
        //用ajax开发之后把名字加入进去
        Department department=employeeDAO.selectDepartment(employee.getEmployeedepartmentid());
        employee.setEmployeedepartmentname(department.getDepartmentname());
        employee.setId(UUID.randomUUID().toString());
         employeeDAO.addEmployee(employee);
    }




    //ajax开发
    @Override
    public List<Department> selectAllDepartment() {
        //ajax写入
        List<Department> departments = employeeDAO.selectAllDepartment();
        return departments;
    }

    //set注入

    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
}
