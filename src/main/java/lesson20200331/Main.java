package main.java.lesson20200331;

import main.java.lesson20200331.actor.Person;
import main.java.lesson20200331.object.Chair;
import main.java.lesson20200331.object.Sofa;
import main.java.lesson20200331.object.Table;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // String str = scanner.nextLine();
        Person.eat("Anna", "meat");
        Person.drink("Irina", "milk");
        Table.getHeight(12);
        Chair.getHeight(5);
        Sofa.getHeight(6);
    }
}