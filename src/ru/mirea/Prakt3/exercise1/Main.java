package ru.mirea.Prakt3.exercise1;

public class Main {

    public void main() {
        Circle c1 = new Circle(1, 21, 33);
        Circle c2 = new Circle(12.33d);
        Circle c3 = new Circle();
        c3.setR(5.55d);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
