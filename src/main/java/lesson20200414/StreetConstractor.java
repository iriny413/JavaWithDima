package main.java.lesson20200414;

import java.sql.SQLOutput;

public class StreetConstractor {
    public static void buildStreet(){
Street[] streets = new Street[10];

        Street superStreet = new Street("Black", "crowdy",1000);
        streets[0] = superStreet;
        streets[1] = new Street("Red","empty", 23);
        streets[2] = new Street("Orange");
        streets[3] = new Street();
        streets[4] = new Street("Blue");
        streets[5] = new Street("Pink", "popular", 20000);
        streets[6] = new Street();
        streets[7] = new Street();
        streets[8] = new Street();
        streets[9] = new Street();

        for(int i=0; i<streets.length; i++){
            System.out.println("New street is " + streets[i]);
        }
}
}
