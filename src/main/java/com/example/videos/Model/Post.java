package com.example.videos.Model;

public class Post {

    private String name;

    private String url;


    public Post(){}

    public Post(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public String toString() {
        return "Post{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
