package org.example;

public abstract class Information {
    String name;
    int age;
    int speed;

    public Information(String name, int age, int speed) {
        this.name = name;
        this.age = age;
        this.speed = speed;
    }

    public String returnName() {
        return "Это ";
    };

    @Override
    public String toString() {
        return "Information{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", speed=" + speed +
                '}';
    }
}
