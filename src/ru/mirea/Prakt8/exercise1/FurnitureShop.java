package ru.mirea.Prakt8.exercise1;

import ru.mirea.Prakt7.Dish;

import java.util.ArrayList;

public class FurnitureShop {
    int wallet = 30000;
    String[] colors = {"black", "white", "green", "red", "blue"};
    ArrayList<Furniture> catalog = new ArrayList<>();
    public void main()
    {
        System.out.println("Добрый день. Приветствуем вас в нашем магазинчике");
        System.out.println("В вашем кошельке: " + wallet + " у.е.");
        init_katalog();
        System.out.println("Хочется представить к вашему вниманию каталог наших товаров: ");

    }

    public void init_katalog()
    {
        init_chairs();
        init_tables();
        init_sofs();
    }

    public void init_chairs()
    {
        for(int i = 0; i < 4; i++)
        {
            catalog.add(new Chair(ran(5), ran(10), ran(3), ran(2500), colors[(int)(Math.random()*5)]));
        }
    }

    public void init_tables()
    {
        for(int i = 0; i < 4; i++)
        {
            catalog.add(new Table(ran(20), ran(20), ran(10), ran(5000), colors[(int)(Math.random()*5)]));
        }
    }

    public void init_sofs()
    {
        for(int i = 0; i < 4; i++)
        {
            catalog.add(new Sofa(ran(15), ran(5), ran(40), ran(10000), colors[(int)(Math.random()*5)]));
        }
    }

    public int ran(int i)
    {
        return (int)(Math.random()*i)+i;
    }
}
