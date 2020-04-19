package main.java.lesson20200407_location;

public class CityConstractor {
    public static void buildCities() {

        City[] cityArray = new City[7];
        cityArray[0] = new City("spb", 444);
        cityArray[1] = new City("vrn", 50000);
        cityArray[2] = new City("paris", 60000);
        cityArray[3] = new City("moscow", 70000);
        cityArray[4] = new City("lpzk", 80000);
        cityArray[5] = new City("brnsk", 90000);
        cityArray[6] = new City("omsk", 110000);

        for (int i = 0; i < cityArray.length; i++) {
            // неявно выполняется sheepArray[i].toString();
            System.out.println(cityArray[i]);
        }
    }
}