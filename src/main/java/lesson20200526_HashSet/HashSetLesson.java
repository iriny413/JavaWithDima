package main.java.lesson20200526_HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetLesson {
    public static void runCheck(){

        House house1 = new House();
        //house1.numberOfHouseResidents = 15;
        House house2 = new House();
        House house3 = new House();

        Set houseSet = new HashSet();
        //houseSet.add(house1);

        System.out.println("House set: " + houseSet + houseSet.size());
    }
}
