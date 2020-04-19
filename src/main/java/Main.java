package main.java;

import main.java.lesson20200331.actor.Person;
import main.java.lesson20200331.object.Chair;
import main.java.lesson20200331.object.Sofa;
import main.java.lesson20200331.object.Table;
import main.java.lesson20200407.City;

import java.util.Scanner;

/**
 * Класс содержащий main метод.
 * Начало выполнения программ.
 */
public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String str = scanner.nextLine();
        Person.eat("Anna", "meat"); //20200331
        Person.drink("Irina", "milk"); //20200331
        Table.getHeight(12); //20200331
        Chair.getHeight(5); //20200331
        Sofa.getHeight(6); //20200331
        Person.playWithDog(); //20200402

        System.out.println(City.c1.toString()); //20200407
        //ПримерЗакоментированогоУрокаЧтоБыОнНеВыполнялся.
    }
}