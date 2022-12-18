package com.example.myapplication;

public class modelClass {

    private int image;
    private  String name;
    private String descrip;

    modelClass(int image,String name,String descrip){

        this.image=image;
        this.name=name;
        this.descrip=descrip;

    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDescrip() {
        return descrip;
    }




}
