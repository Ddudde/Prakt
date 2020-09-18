package ru.mirea.Prakt3.exercise1;

public class Circle {
    private double r, c, s;
    public Circle(double r, double c,double s)
    {
        this.r = r;
        this.c = c;
        this.s = s;
    }
    public Circle(double r)
    {
        this.r = r;
        this.c = find_C(r);
        this.s = find_S(r);

    }

    public Circle()
    {
        this.r = 0.d;
        this.c = 0.d;
        this.s = 0.d;
    }
    public double getC() {
        return c;
    }

    public double getR() {
        return r;
    }

    public double getS() {
        return s;
    }

    public double find_C(double r){
        return 2*Math.PI*r;

    }
    public double find_S(double r){
        return Math.PI*r*r;

    }

    public void setR(double r) {
        this.r = r;
        this.c = find_C(r);
        this.s = find_S(r);
    }

    @Override
    public String toString() {
        return "радиус r=" + r +
                ", длинна окружности c=" + c +
                ", прощать круга s=" + s;

    }
}
