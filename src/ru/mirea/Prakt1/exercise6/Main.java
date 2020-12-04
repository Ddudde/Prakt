package ru.mirea.Prakt1.exercise6;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] mas = new int[10];
        for(int a = 0; a < 10; a++)
        {
            mas[a] = (int)(Math.random()*100);
        }
        System.out.println("Массив случайных чисел");
        for(int a = 0; a < 10; a++)
        {
            System.out.println(mas[a]);
        }
        Arrays.sort(mas, 0, 10);
        System.out.println("Отсортированный массив");
        for(int a = 0; a < 10; a++)
        {
            System.out.println(mas[a]);
        }
    }
}
