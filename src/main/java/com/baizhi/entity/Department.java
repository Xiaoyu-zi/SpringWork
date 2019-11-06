package com.baizhi.entity;

import java.util.List;
import java.util.Objects;

public class Department {
    //id departmentnumber departmentname
    private String id;
    private String departmentnumber;
    private String departmentname;
    //采用一对多的
    //一个部门有多个员工
    public List<Employee> employees;

    public Department() {
    }

    public Department(String id, String departmentnumber, String departmentname, List<Employee> employees) {
        this.id = id;
        this.departmentnumber = departmentnumber;
        this.departmentname = departmentname;
        this.employees = employees;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartmentnumber() {
        return departmentnumber;
    }

    public void setDepartmentnumber(String departmentnumber) {
        this.departmentnumber = departmentnumber;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(departmentnumber, that.departmentnumber) &&
                Objects.equals(departmentname, that.departmentname) &&
                Objects.equals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, departmentnumber, departmentname, employees);
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", departmentnumber='" + departmentnumber + '\'' +
                ", departmentname='" + departmentname + '\'' +
                ", employees=" + employees +
                '}';
    }
}
