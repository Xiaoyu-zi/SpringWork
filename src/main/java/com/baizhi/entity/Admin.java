package com.baizhi.entity;

import java.util.Objects;

public class Admin {
    //id adminname adminpassword
    private String id;
    private String adminname;
    private String adminrealname;
    private String adminpassword;
    private String adminsex;

    public Admin(String id, String adminname, String adminrealname, String adminpassword, String adminsex) {
        this.id = id;
        this.adminname = adminname;
        this.adminrealname = adminrealname;
        this.adminpassword = adminpassword;
        this.adminsex = adminsex;
    }

    public Admin() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdminrealname() {
        return adminrealname;
    }

    public void setAdminrealname(String adminrealname) {
        this.adminrealname = adminrealname;
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }

    public String getAdminsex() {
        return adminsex;
    }

    public void setAdminsex(String adminsex) {
        this.adminsex = adminsex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(id, admin.id) &&
                Objects.equals(adminname, admin.adminname) &&
                Objects.equals(adminrealname, admin.adminrealname) &&
                Objects.equals(adminpassword, admin.adminpassword) &&
                Objects.equals(adminsex, admin.adminsex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adminname, adminrealname, adminpassword, adminsex);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id='" + id + '\'' +
                ", adminname='" + adminname + '\'' +
                ", adminrealname='" + adminrealname + '\'' +
                ", adminpassword='" + adminpassword + '\'' +
                ", adminsex='" + adminsex + '\'' +
                '}';
    }
}