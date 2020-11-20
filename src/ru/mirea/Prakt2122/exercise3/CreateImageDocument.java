package ru.mirea.Prakt2122.exercise3;

public class CreateImageDocument implements ICreateDocument{
    @Override
    public IDocument CreateNew() {
        return new ImageDocument();
    }

    @Override
    public IDocument CreateOpen(IDocument doc) {
        doc.open();
        return doc;
    }
}
