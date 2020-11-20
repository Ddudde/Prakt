package ru.mirea.Prakt2122.exercise3;

public class CreateMusicDocument implements ICreateDocument{
    @Override
    public IDocument CreateNew() {
        return new MusicDocument();
    }

    @Override
    public IDocument CreateOpen(IDocument doc) {
        doc.open();
        return doc;
    }
}
