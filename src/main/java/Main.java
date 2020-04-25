package main.java;

import main.java.lesson20200331.actor.Person;
import main.java.lesson20200331.object.Chair;
import main.java.lesson20200331.object.Sofa;
import main.java.lesson20200331.object.Table;
import main.java.lesson20200407_location.CityConstractor;
import main.java.lesson20200414.EqualsStreet;
import main.java.lesson20200414.StreetConstractor;
import main.java.lesson20200421.Bus;
import main.java.lesson20200421.Car;
import main.java.lesson20200421.Truck;
import main.java.lesson20200421.Vehicle;

class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // String str = scanner.nextLine();
//        Person.eat("Anna", "meat");
//        Person.drink("Irina", "milk");
//        Table.getHeight(12);
//        Chair.getHeight(5);
//        Sofa.getHeight(6);
//        Person.playWithDog();
        //CityConstractor.buildCities();
        //StreetConstractor.buildStreet();
        //StreetConstractor.compareData();
        Vehicle.drive();
        Vehicle.stop();
        Truck.drive();
        Truck.stop();
        Bus.drive();
        Bus.stop();
        Car.drive();
        Car.stop();
    }
}