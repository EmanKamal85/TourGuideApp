package com.example.tourguideapp;

public class Place {
    static private boolean hasImage;
    private String name;
    private String overView;
    private String location;
    private int imageResourceId;

    public Place(String name, String overView, String location) {
        this.name = name;
        this.overView = overView;
        this.location = location;
        hasImage = false;
    }

    public Place(String name, String overView, String location, int imageResourceId) {
        this.name = name;
        this.overView = overView;
        this.location = location;
        this.imageResourceId = imageResourceId;
        hasImage = true;
    }

    public String getName() {
        return name;
    }

    public String getOverView() {
        return overView;
    }

    public String getLocation() {
        return location;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean getHasImage() {
        return hasImage;
    }
}
