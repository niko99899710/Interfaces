package org.example;

import org.interfaces.Flyable;
import org.interfaces.Swimmable;

public class Human extends Information implements Flyable, Swimmable {

    public Human(String name, int age, int speed) {
        super(name, age, speed);
    }

    @Override
    public String returnName() {
        return  super.returnName() + "Busay";
    }

    @Override
    public void fly() {
        System.out.println("Человек летает на самолете");
    }
    @Override
    public void swim() {
        System.out.println("Человек плавает кролем");

    }
}
