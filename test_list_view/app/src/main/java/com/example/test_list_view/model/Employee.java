package com.example.test_list_view.model;

public class Employee {
    private int  id;
    private int imageId;
    private String name;
    private String brief;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee() {
    }

    public Employee(int id, int imageId, String name, String brief) {
        this.id = id;
        this.imageId = imageId;
        this.name = name;
        this.brief = brief;
    }
}
