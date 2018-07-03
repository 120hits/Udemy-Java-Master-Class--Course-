package com.RS;

public class SoundSystem {
    private String type;
    private String company;
    private String quality;

    public SoundSystem(String type, String company, String quality) {
        this.type = type;
        this.company = company;
        this.quality = quality;
    }

    public String getType() {
        return type;
    }

    public String getCompany() {
        return company;
    }

    public String getQuality() {
        return quality;
    }
}
