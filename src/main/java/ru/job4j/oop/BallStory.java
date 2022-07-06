package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        hare.tryEat(ball);
        Wolff wolff = new Wolff();
        Fox fox = new Fox();
        wolff.tryEat(ball);
        fox.tryEat(ball);
    }
}
