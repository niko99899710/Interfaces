package org.example;

import org.interfaces.Swimmable;

public class Fish extends Information implements Swimmable {
    public Fish(String name, int age, int speed) {
        super(name, age, speed);
    }

    @Override
    public String returnName() {
        return super.returnName() + "PIPI";
    }

    @Override
    public void swim() {
        System.out.println("Рыбка плавает");
    }
}
