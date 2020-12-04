package ru.mirea.Prakt1.exercise7;

public class Main {

    static int fact(int n){
        int res = 1;
        for (int i = 1; i <=n; i++){
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fact(7));
    }
}
