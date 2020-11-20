package ru.mirea.Prakt2122.exercise3;

public class ImageDocument implements IDocument {

    @Override
    public void open() {
        System.out.println("ImageDocument opened");
    }

    @Override
    public void nw() {
        System.out.println("ImageDocument created");
    }
}
