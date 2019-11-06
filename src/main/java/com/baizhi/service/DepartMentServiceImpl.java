package com.baizhi.service;

import com.baizhi.dao.DepartmentDAO;
import com.baizhi.dao.EmployeeDAO;
import com.baizhi.entity.Department;
import com.baizhi.entity.Employee;

import java.util.List;
import java.util.UUID;

public class DepartMentServiceImpl implements DepartmentService{
    private DepartmentDAO departmentDAO;
    //部门查询
    private EmployeeDAO employeeDAO;
    @Override
    public List<Department> queryAll() {
        List<Department> departments = departmentDAO.queryAll();
        return departments;
    }

    //添加部门
    @Override
    public void modifyaddDepartment(Department department) {
        department.setId(UUID.randomUUID().toString());
        departmentDAO.addDepartment(department);
    }

    //查询一个部门
    @Override
    public Department queryDepartment(String id) {
        Department department = departmentDAO.queryDepartment(id);
        return department;
    }

    //修改部门
    @Override
    public void modifyupdateDepartment(Department department) {
        //问题时：修改之后和修改之前的部门都会展示（解决方法是通过ID查询）
        List<Employee> employees = departmentDAO.selectEmployee(department.getId());
        for (Employee employee : employees) {
            //先修改修改员公修改之后的
            employee.setEmployeedepartmentname(department.getDepartmentname());
            employeeDAO.updateEmployee(employee);
        }
        departmentDAO.updateDepartment(department);
    }


    public void setDepartmentDAO(DepartmentDAO departmentDAO) {
        this.departmentDAO = departmentDAO;
    }
    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
}
