package ru.mirea.Prakt2122.exercise3;

public class TextDocument implements IDocument {

    @Override
    public void open() {
        System.out.println("TextDocument opened");
    }

    @Override
    public void nw() {
        System.out.println("TextDocument created");
    }
}
