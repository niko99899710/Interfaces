package org.example;

import org.interfaces.Flyable;

public class Bird extends Information implements Flyable {
    public Bird(String name, int age, int speed) {
        super(name, age, speed);
    }

    @Override
    public String returnName() {
        return super.returnName() + "FANNY";
    }

    @Override
    public void fly() {
        System.out.println("Птица летает");

    }
}
