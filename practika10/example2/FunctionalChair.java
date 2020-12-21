package ru.mirea.practika10.example2;

public class FunctionalChair implements Chair {
    public int sum(int a, int b){
        return a + b;
    }

    @Override
    public void doSomething() {
        System.out.println("Ответ на главный вопрос жизни, вселенной и вообще - " + sum(23, 19) + ".");
    }
}
