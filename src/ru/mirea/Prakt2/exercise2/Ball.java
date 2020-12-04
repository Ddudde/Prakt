package ru.mirea.Prakt2.exercise2;

public class Ball {
    private int diametr;
    private String color;

    public Ball(int diametr, String color) {
        this.diametr = diametr;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "diametr=" + diametr +
                ", color='" + color + '\'' +
                '}';
    }
}
