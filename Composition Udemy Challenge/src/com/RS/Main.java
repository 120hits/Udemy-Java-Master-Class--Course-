package com.RS;

public class Main {

    public static void main(String[] args) {

        Bed bed = new Bed("xyz", "twin bed");
        Computer computer = new Computer("HP", "Laptop", "4");
        drawer drawer = new drawer("wood", "medium");
        Closet closet = new Closet("normal", "medium");
        Posters posters = new Posters("vinel", "medium", "Futbol");
        SoundSystem soundSystem = new SoundSystem("2s1b", "THX", "premium ");


        Bedroom bedroom = new Bedroom(bed, computer, drawer, closet, posters, soundSystem);
        bed.getModel();
        bed.getSize();


    }
}


/*
 * create a single room of a house using composition
 * think about the things that should be included in the room
 * maybe physical parts of the house but furniture as well
 * add at least one method to access an object via a getter and
 * then that objects public method as you sae in the previous video
 * then add at least one method to hide the object eg not using a getter
 * but to access the object used in composition within the main class
 * like you saw in the comp p2 video
 *
 *
 *
 *
 *
 * */