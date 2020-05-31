package main.java.lesson20200526_HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetLesson {

    @Override
    public String toString() {
        return "HashSetLesson{}";
    }

    public static void runCheck(){
        HashSet<House> houseSet = new HashSet<>();

        House house1 = new House();
        house1.street = new Street(1, "GreenA");
        house1.numberOfHouseResidents = 15;
        House house2 = new House();
        house2.street = new Street(2, "GreenA");
        house2.numberOfHouseResidents = 20;
        House house3 = new House();
        house3.street = new Street(2, "GreenA");
        house3.numberOfHouseResidents = 20;

        houseSet.add(house1);
        houseSet.add(house2);
        houseSet.add(house3);
        System.out.println("H1: " + house1);
        System.out.println("H2: " + house2);
        System.out.println("H3: " + house3);
        System.out.println("House set: " + houseSet + houseSet.size());

    }
}
