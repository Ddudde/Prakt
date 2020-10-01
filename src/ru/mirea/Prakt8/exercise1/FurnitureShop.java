package ru.mirea.Prakt8.exercise1;

import ru.mirea.Prakt7.Dish;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureShop {
    int wallet = 30000;
    int num = 1;
    String[] colors = {"black", "white", "green", "red", "blue"};
    ArrayList<Furniture> catalog = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    public void main()
    {
        System.out.println("Добрый день. Приветствуем вас в нашем магазинчике");
        print_wallet();
        init_katalog();
        System.out.println("Хочется представить к вашему вниманию каталог наших товаров: ");
        print_katalog();
        System.out.println("Какой номер вас заинтересовал?");
        num = in.nextInt();
        buy();
    }

    public void buy()
    {
        Furniture fur = getFurniture(num);
        if(fur == null)
        {
            System.out.println("Простите, товара нет в наличии");
            return;
        }
        if(wallet < fur.cost)
        {
            System.out.println("У вас недостаточно у.е.");
            print_wallet();
            return;
        }
        catalog.remove(num-1);
        wallet -= fur.cost;
        System.out.println("Поздравляю, вы успешно приобрели товар.");
        print_wallet();
        System.out.println("Обновлённый каталог:");
        print_katalog();
    }

    public void print_wallet()
    {
        System.out.println("В вашем кошельке: " + wallet + " у.е.");
    }

    public Furniture getFurniture(int j)
    {
        for(Furniture sd : catalog)
        {
            if (sd.num == j) return sd;
        }
        return null;
    }

    public void init_katalog()
    {
        init_chairs();
        init_tables();
        init_sofs();
    }

    public void print_katalog()
    {
        for(Furniture sd : catalog)
        {
            System.out.println("№: " + sd.num + ", Furniture: " + sd.type + ", color: " + sd.color + ", cost: " + sd.cost + ", width: " + sd.width + ", height: " + sd.height + ", mass: " + sd.mass);
        }
    }

    public void init_chairs()
    {
        for(int i = 0; i < 4; i++, num++)
        {
            catalog.add(new Chair(num, ran(5), ran(10), ran(3), ran(2500), colors[(int)(Math.random()*5)],"Chair"));
        }
    }

    public void init_tables()
    {
        for(int i = 0; i < 4; i++, num++)
        {
            catalog.add(new Table(num, ran(20), ran(20), ran(10), ran(5000), colors[(int)(Math.random()*5)], "Table"));
        }
    }

    public void init_sofs()
    {
        for(int i = 0; i < 4; i++, num++)
        {
            catalog.add(new Sofa(num, ran(15), ran(5), ran(40), ran(10000), colors[(int)(Math.random()*5)], "Sofa"));
        }
    }

    public int ran(int i)
    {
        return (int)(Math.random()*i)+i;
    }
}
