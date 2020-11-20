package ru.mirea.Prakt2122.exercise3;

public class CreateTextDocument implements ICreateDocument{
    @Override
    public IDocument CreateNew() {
        return new TextDocument();
    }

    @Override
    public IDocument CreateOpen(IDocument doc) {
        doc.open();
        return doc;
    }
}
