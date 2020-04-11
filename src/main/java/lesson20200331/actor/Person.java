package main.java.lesson20200331.actor;

public class Person {

    public static void eat(String name, String food) {
        System.out.println(name + " eats " + food);
    }

    public static void drink(String name, String drink) {
        System.out.println(name + " drinks " + drink);
    }
}
        // Создать пакет lesson20200331. Внутри создать два пакета: actor и object.
        // Внутри actor создать класс Person c методами eat() и drink().
        // Внурти object создать классы Table, Chair, Sofa.
        // Внутри каждого класса создать метод getHeight() который выводит на экран высоту предмета.
        // В каждом классе должен быть свой модификатор доступа.
        // Попробовать вызвать все классы в main


