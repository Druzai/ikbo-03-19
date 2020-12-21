package ru.mirea.practika10.example2;

public class MagicChair implements Chair {
    public void doMagic(){
        System.out.println("Ммммагия...");
    };
    @Override
    public void doSomething() {
        doMagic();
    }
}
