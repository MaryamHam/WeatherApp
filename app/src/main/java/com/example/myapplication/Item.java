package com.example.myapplication;

public class Item {

    private String title;
    private int  image;
    private String content;
   // private String detail;


    public Item(String title,int image, String content) {
        this.title = title;
        this.image = image;
        this.content = content;
        //this.detail = detail;

    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
    public int getImage() {
        return image;
    }

  //  public String getDetail() {
        //return detail;
   // }
}
