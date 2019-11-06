package com.baizhi.action;

import com.alibaba.fastjson.JSON;
import com.baizhi.entity.Department;
import com.baizhi.entity.Employee;
import com.baizhi.service.EmployeeService;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class EmployeeAction {
    //接收参数
    private List<Employee> employees;
    private Employee employee;
    private String id;

    //员工列表
    private String employeedepartmentid;

    public String getEmployeedepartmentid() {
        return employeedepartmentid;
    }

    public void setEmployeedepartmentid(String employeedepartmentid) {
        this.employeedepartmentid = employeedepartmentid;
    }

    private EmployeeService employeeService;

    //展示所有
    public String show(){
        employees=employeeService.queryAll(employeedepartmentid);
        return "success";
    }

    //查看要修改的员工的信息
    public String queryEmployee(){
        employee=employeeService.queryEmployee(id);
        return "success";
    }

    //修改员工信息
    public String update(){
        employeeService.modifyupdateEmployee(employee);
        return "success";
    }

    //删除员工信息
    public String delete(){
        employeeService.modifydeleteEmployee(id);
        return "success";
}

    //添加员工的信息
    public String add(){
        employeeService.modifyaddEmployee(employee);
        return "success";
    }



    //ajax开发
    public String querydepartment(){
        List<Department> departments = employeeService.selectAllDepartment();

        //把集合转化为json协议串
        String jsonString = JSON.toJSONString(departments);
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setCharacterEncoding("UTF-8");
        try {
            PrintWriter writer = response.getWriter();
            writer.print(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    //Set注入

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}
