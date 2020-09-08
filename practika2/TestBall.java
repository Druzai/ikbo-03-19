package ru.mirea.practika2;

public class TestBall {
    public static void main(String[] args){
        Ball ball = new Ball(50, 50);
        System.out.println(ball);
        ball.move(90, 10);
        System.out.println(ball);
    }
}
