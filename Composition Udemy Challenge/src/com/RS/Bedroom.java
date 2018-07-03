package com.RS;

public class Bedroom {
    private Bed bed;
    private Computer computer;
    private drawer drawer;
    private Closet closet;
    private Posters posters;
    private SoundSystem soundSystem;

    public Bedroom(Bed bed, Computer computer, drawer drawer, Closet closet, Posters posters, SoundSystem soundSystem) {
        this.bed = bed;
        this.computer = computer;
        this.drawer = drawer;
        this.closet = closet;
        this.posters = posters;
        this.soundSystem = soundSystem;
    }

    public Bed getBed() {
        return bed;
    }

    public Computer getComputer() {
        return computer;
    }

    public drawer getDrawer() {
        return drawer;
    }

    public Closet getCloset() {
        return closet;
    }

    public Posters getPosters() {
        return posters;
    }

    public SoundSystem getSoundSystem() {
        return soundSystem;
    }
}
