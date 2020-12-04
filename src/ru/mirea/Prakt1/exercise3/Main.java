package ru.mirea.Prakt1.exercise3;

public class Main {

    public static void main(String[] args) {
        int[] mass = {1,2,3,4,5,6,7};
        int sum = 0;
        for(int a : mass)
        {
            sum+=a;
        }
        System.out.println("Число суммы массива: " + sum);
    }
}
