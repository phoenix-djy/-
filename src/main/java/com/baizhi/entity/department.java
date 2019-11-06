package com.baizhi.entity;

public class department {
    private String id;
    private String deptname;

    @Override
    public String toString() {
        return "department{" +
                "id='" + id + '\'' +
                ", deptname='" + deptname + '\'' +
                '}';
    }

    public department() {
    }

    public department(String id, String deptname) {
        this.id = id;
        this.deptname = deptname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}
