package ru.mirea.Prakt1516.exercise1;

public class LeftLeg implements Runnable {

    Common res;

    public LeftLeg(Common res) {
        this.res = res;
    }

    @Override
    public void run() {
        synchronized (this) {
            while (true) {
                try {
                    this.wait(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                res.print();
            }
        }
    }
}