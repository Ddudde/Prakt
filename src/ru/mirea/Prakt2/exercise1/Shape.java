package ru.mirea.Prakt2.exercise1;

public class Shape {
    private int NumberOS;
    private String NameOS;
    private int lenght;

    public Shape()
    {
    }

    public Shape(int Num, String Name)
    {
        NumberOS = Num;
        NameOS = Name;
    }

    public Shape(int numberOS, String nameOS, int lenght) {
        NumberOS = numberOS;
        NameOS = nameOS;
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "NumberOS=" + NumberOS +
                ", NameOS='" + NameOS + '\'' +
                ", lenght=" + lenght +
                '}';
    }
}
