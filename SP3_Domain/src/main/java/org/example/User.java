package org.example;

import java.util.ArrayList;

public class User {
private String name;
private String username;
private  String password;

//  recentlyViewed laves senere
    ArrayList <Media> watchList = new ArrayList<>();
    ArrayList <Media> saveMedia = new ArrayList<>();
    ArrayList <Media> allMedia = new ArrayList<>();

    public void addMedia(){


    }

    public void removeMedia(){


    }

    public User(String name, ) {
        this.name = name;

    }

    public String getName(){
        return name;

    }

}
