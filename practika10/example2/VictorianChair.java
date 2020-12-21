package ru.mirea.practika10.example2;

public class VictorianChair implements Chair {
    private int age;

    VictorianChair(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void doSomething() {
        System.out.println("Возраст - " + getAge() + " лет.");
    }
}
