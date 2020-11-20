package ru.mirea.Prakt2122.exercise1;

public class MulComplex implements Complex{
    @Override
    public void start() {
        System.out.println("Новое комплексное число: z = " + rnd() + " * " + rnd() + "i");
    }

    public int rnd()
    {
        return (int)(Math.random()*10);
    }
}