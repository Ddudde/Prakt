package ru.mirea.Prakt1516.exercise1;


public class RightLeg implements Runnable {

    private final Controller res;

    public RightLeg(Controller res) {
        this.res = res;
    }

    @Override
    public void run() {
        synchronized (res) {
            while (true) {
                System.out.println("Right");
                res.print();
            }
        }
    }
}