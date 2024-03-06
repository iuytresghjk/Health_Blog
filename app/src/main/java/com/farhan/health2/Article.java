package com.farhan.health2;


public class Article {
    private String title;
    private String author;
    private String description;
    private int image;

    public Article(String s, String matt_crisara, String s1, String s2, int image3) {


    }

    public Article(String title, String author, String description, int image) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}


