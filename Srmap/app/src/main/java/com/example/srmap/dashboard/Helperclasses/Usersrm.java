package com.example.srmap.dashboard.Helperclasses;

public class Usersrm {
    private String images;
    private String title;
    private String maindescription;
    private String seconddescription;
    private String stamp;

    public Usersrm (){

    }

    public Usersrm(String images, String title, String maindescription, String seconddescription, String stamp) {
        this.images = images;
        this.title = title;
        this.maindescription = maindescription;
        this.seconddescription = seconddescription;
        this.stamp = stamp;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMaindescription() {
        return maindescription;
    }

    public void setMaindescription(String maindescription) {
        this.maindescription = maindescription;
    }

    public String getSeconddescription() {
        return seconddescription;
    }

    public void setSeconddescription(String seconddescription) {
        this.seconddescription = seconddescription;
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp;
    }
}
