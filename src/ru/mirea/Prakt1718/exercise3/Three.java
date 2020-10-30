package ru.mirea.Prakt1718.exercise3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Three {
    public static void main(String[] args) {
        System.out.println("Список цен:");
        String inp = "Hell\nWindows";
        System.out.println(inp);
        System.out.println();
        Pattern pattern = Pattern.compile("Windows",Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(inp);
        System.out.println("Список верифицированных цен:");
        System.out.println(matcher.find() ? matcher.group() : "Не найдено ценников");
    }
}
