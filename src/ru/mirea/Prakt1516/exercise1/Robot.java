package ru.mirea.Prakt1516.exercise1;

public class Robot
{
    public static void main(String[] args) {
        Common common = new Common();
        Thread l = new Thread(new LeftLeg(common), "1");
        Thread r = new Thread(new RightLeg(common), "2");
        l.start();
        r.start();
    }
}