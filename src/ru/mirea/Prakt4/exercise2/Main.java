package ru.mirea.Prakt4.exercise2;

public class Main {

    public void main() {
	Author author = new Author("Emelya", "email@mail.ru",'m');
	System.out.println(author);
	author.setEmail("emelya@mail.ru");
	System.out.println(author);
	System.out.println(author.getName());
    }
}
