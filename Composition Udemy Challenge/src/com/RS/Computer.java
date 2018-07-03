package com.RS;

public class Computer {
    private String model;
    private String type;
    private String age;

    public Computer(String model, String type, String age) {
        this.model = model;
        this.type = type;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getAge() {
        return age;
    }
}
