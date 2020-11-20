package ru.mirea;

import ru.mirea.Prakt2122.exercise1.Complex;
import ru.mirea.Prakt2122.exercise1.Holding;

public class Main {

    public static void main(String[] args) {
        Holding hold = new Holding();
        Complex comp = hold.getRandomComplex();
        comp.start();
    }
}
