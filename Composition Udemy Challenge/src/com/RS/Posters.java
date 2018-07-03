package com.RS;

public class Posters {
    private String type;
    private String size;
    private String sport;

    public Posters(String type, String size, String sport) {
        this.type = type;
        this.size = size;
        this.sport = sport;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public String getSport() {
        return sport;
    }
}
