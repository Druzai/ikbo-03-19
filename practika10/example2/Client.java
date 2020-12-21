package ru.mirea.practika10.example2;

public class Client{
    public Chair chair;
    public void sit(){
        chair.doSomething();
    }
    public void setChair(Chair chair){
        this.chair = chair;
    }
}
