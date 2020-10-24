package ru.mirea.Prakt1516.exercise1;

public class Robot
{
    public static void main(String[] args) {
        Controller controller = new Controller();
        Thread l = new Thread(new LeftLeg(controller));
        Thread r = new Thread(new RightLeg(controller));
        l.start();
        r.start();
    }
}