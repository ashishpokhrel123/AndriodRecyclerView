package com.example.recyclerview;

public class contact {
    private String name;
    private String phone;
    private int imgid;

    public contact(String name, String phone, int imgid) {
        this.name = name;
        this.phone = phone;
        this.imgid = imgid;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getImgid() {
        return imgid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setImageid(int imgid) {
        this.imgid = imgid;
    }




}
