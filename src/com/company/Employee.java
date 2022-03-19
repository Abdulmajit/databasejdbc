package com.company;

public class Employee {
    private int id;
    private String name;
    private String phone;
    private int position_id;
    private int salary_id;
    private int store_id;

    public Employee() {
    }

    public Employee(int id, String name, String phone, int position_id, int salary_id, int store_id) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.position_id = position_id;
        this.salary_id = salary_id;
        this.store_id = store_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPosition_id() {
        return position_id;
    }

    public void setPosition_id(int position_id) {
        this.position_id = position_id;
    }

    public int getSalary_id() {
        return salary_id;
    }

    public void setSalary_id(int salary_id) {
        this.salary_id = salary_id;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }
}
