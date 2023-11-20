package org.example;

import java.util.ArrayList;

public class User {
private String name;
private String username;
private  String password;
//  recentlyViewed
    ArrayList <Media> watchList = new ArrayList<>();
    ArrayList <Media> saveMedia = new ArrayList<>();
    ArrayList <Media> allMedia = new ArrayList<>();

    public void addMedia(){


    }

    public void removeMedia(){


    }

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName(){
        return name;

    }

    public String getUsername(){
        return username;

    }

    public String getPassword() {
        return password;
    }
}
