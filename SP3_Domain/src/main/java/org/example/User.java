package org.example;

import java.util.ArrayList;

public class User {
private String name;

//  recentlyViewed laves senere
    ArrayList <Media> watchList;
    ArrayList <Media> saveMedia;
    ArrayList <Media> allMedia;

    public void addMedia(Media media){
    watchList.add(media);
    saveMedia.add(media);
    }

    public void removeMedia(Media media){
    watchList.add(media);
    saveMedia.add(media);
    }

    public User(String name) {
        this.name = name;
        this.watchList = new ArrayList<>();
        this.saveMedia = new ArrayList<>();
        this.allMedia = new ArrayList<>();

    }

    public String getName(){
        return name;

    }

}
