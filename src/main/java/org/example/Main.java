package org.example;

import org.interfaces.Flyable;
import org.interfaces.Swimmable;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1(){
        Swimmable human = new Human("BUSAY", 1, 30);
        ((Flyable) human).fly();
        human.swim();
        System.out.println("Человек " + ((Human) human).returnName());
    }
    public static void task2(){
        Swimmable fish = new Fish("PIPI",1,10);
        fish.swim();
        System.out.println("Рыба " + ((Fish) fish).returnName());
    }
    public static void task3(){
        Flyable bird = new Bird("Funny", 2,25);
        bird.fly();
        System.out.println("Птица " + ((Bird) bird).returnName());
    }

}