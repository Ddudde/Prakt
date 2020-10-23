package ru.mirea.Prakt1516.exercise1;

public class Common {
    private boolean s = true;

    synchronized void print()
    {
        System.out.println(s ? "Left" : "Right");
        s = !s;
    }
}
