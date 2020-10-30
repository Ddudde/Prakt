package ru.mirea.Prakt1718.exercise1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class One {

    static Scanner inw = new Scanner(System.in);

    public static void main(String[] args) {
        while (true)
            System.out.println((Pattern.matches("abcdefghijklmnopqrstuv18340", inw.next()) ? "П" : "Неп") + "равильное выражение");
    }
}