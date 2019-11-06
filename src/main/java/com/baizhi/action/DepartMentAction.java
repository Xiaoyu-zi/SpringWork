package com.baizhi.action;

import com.baizhi.entity.Department;
import com.baizhi.service.DepartmentService;

import java.util.List;

public class DepartMentAction {
    private DepartmentService departmentService;

    //接收参数
    private Department department;
    private String id;
    private List<Department> departments;

    //部门的展示
    public  String show(){
        departments=departmentService.queryAll();
        return "success";
    }

    //部门添加
    public String add(){
        departmentService.modifyaddDepartment(department);
        return "success";
    }

    //查询部门的ID
    public  String queryID(){
        department=departmentService.queryDepartment(id);
        return "success";
    }

    //修改部门
    public String update(){
        System.out.println("修改部门进来了！！！！");
        try {
            departmentService.modifyupdateDepartment(department);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }












    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public List<Department> getDepartments() {
        return departments;
    }
    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
