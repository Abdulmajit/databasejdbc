package com.company;

public class Position {
    private int id;
    private String name;
    private int is_active;

    public Position() {
    }

    public Position(int id, String name, int is_active) {
        this.id = id;
        this.name = name;
        this.is_active = is_active;
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

    public int getIs_active() {
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }
}
