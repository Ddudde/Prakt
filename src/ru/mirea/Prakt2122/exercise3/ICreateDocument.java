package ru.mirea.Prakt2122.exercise3;

public interface ICreateDocument {
    IDocument CreateNew();
    IDocument CreateOpen(IDocument doc);
}
