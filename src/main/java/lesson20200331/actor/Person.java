package main.java.lesson20200331.actor;

import main.java.lesson20200402.animal.Dog;

public class Person {

    public static void eat(String name, String food) {
        System.out.println(name + " eats " + food);
    }

    public static void drink(String name, String drink) {
        System.out.println(name + " drinks " + drink);
    }

    public static void playWithDog(){
        System.out.println("Dog's breed is " +Dog.getBreed());
        System.out.println("Dog's name is " + Dog.getName());
        System.out.println("Dog's sex is " + Dog.getSex());
        System.out.println("Dog's favourite plaything is " + Dog.getFavouritePlaything());
        System.out.println("Current dog age = " + Dog.getAge());
        Dog.gaf("brbr");
        Dog.appendYear(3);
        System.out.println(Dog.guessAge(new int[]{1,2,100}));
    }
}
        // Создать пакет lesson20200331. Внутри создать два пакета: actor и object.
        // Внутри actor создать класс Person c методами eat() и drink().
        // Внурти object создать классы Table, Chair, Sofa.
        // Внутри каждого класса создать метод getHeight() который выводит на экран высоту предмета.
        // В каждом классе должен быть свой модификатор доступа.
        // Попробовать вызвать все классы в main


