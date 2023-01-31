package com.example.recycleview;
// class model User
public class User {
    private  int srcImage;
    private String name;

    public int getSrcImage() {
        return srcImage;
    }

    public void setSrcImage(int srcImage) {
        this.srcImage = srcImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int srcImage, String name) {
        this.srcImage = srcImage;
        this.name = name;
    }
}
