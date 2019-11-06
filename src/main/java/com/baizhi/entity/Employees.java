package com.baizhi.entity;

public class Employees {

    private String id;
    private String username;
    private String password;
    private Integer age;
    private department department;

    @Override
    public String toString() {
        return "Employees{" +
                "id='" + id + '\'' +
                ", name='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", department=" + department +
                '}';
    }

    public Employees() {
    }

    public Employees(String id, String username, String password, Integer age, com.baizhi.entity.department department) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public com.baizhi.entity.department getDepartment() {
        return department;
    }

    public void setDepartment(com.baizhi.entity.department department) {
        this.department = department;
    }
}
