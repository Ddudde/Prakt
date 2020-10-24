package ru.mirea.Prakt1516.exercise1;

public class LeftLeg implements Runnable {

    private final Controller res;

    public LeftLeg(Controller res) {
        this.res = res;
    }

    @Override
    public void run() {
        synchronized (res) {
            while (true) {
                System.out.println("Left");
                res.print();
            }
        }
    }
}