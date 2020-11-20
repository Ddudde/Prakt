package ru.mirea.Prakt2122.exercise3;

public class MusicDocument implements IDocument{
    @Override
    public void open() {
        System.out.println("MusicDocument opened");
    }

    @Override
    public void nw() {
        System.out.println("MusicDocument created");
    }
}
