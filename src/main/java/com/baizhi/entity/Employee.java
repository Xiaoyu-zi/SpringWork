package com.baizhi.entity;

import java.util.Objects;

public class Employee {
    //id  employeename  employeesalary employeeage employeedepartmentname
    private  String id;
    private  String employeename;
    private  Double employeesalary;
    private  Integer employeeage;
    private  String employeedepartmentid;
    private  String employeedepartmentname;

    public Employee() {
    }

    public Employee(String id, String employeename, Double employeesalary, Integer employeeage, String employeedepartmentid, String employeedepartmentname) {
        this.id = id;
        this.employeename = employeename;
        this.employeesalary = employeesalary;
        this.employeeage = employeeage;
        this.employeedepartmentid = employeedepartmentid;
        this.employeedepartmentname = employeedepartmentname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public Double getEmployeesalary() {
        return employeesalary;
    }

    public void setEmployeesalary(Double employeesalary) {
        this.employeesalary = employeesalary;
    }

    public Integer getEmployeeage() {
        return employeeage;
    }

    public void setEmployeeage(Integer employeeage) {
        this.employeeage = employeeage;
    }

    public String getEmployeedepartmentid() {
        return employeedepartmentid;
    }

    public void setEmployeedepartmentid(String employeedepartmentid) {
        this.employeedepartmentid = employeedepartmentid;
    }

    public String getEmployeedepartmentname() {
        return employeedepartmentname;
    }

    public void setEmployeedepartmentname(String employeedepartmentname) {
        this.employeedepartmentname = employeedepartmentname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) &&
                Objects.equals(employeename, employee.employeename) &&
                Objects.equals(employeesalary, employee.employeesalary) &&
                Objects.equals(employeeage, employee.employeeage) &&
                Objects.equals(employeedepartmentid, employee.employeedepartmentid) &&
                Objects.equals(employeedepartmentname, employee.employeedepartmentname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employeename, employeesalary, employeeage, employeedepartmentid, employeedepartmentname);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", employeename='" + employeename + '\'' +
                ", employeesalary=" + employeesalary +
                ", employeeage=" + employeeage +
                ", employeedepartmentid='" + employeedepartmentid + '\'' +
                ", employeedepartmentname='" + employeedepartmentname + '\'' +
                '}';
    }
}
