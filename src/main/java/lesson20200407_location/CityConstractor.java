package main.java.lesson20200407_location;

public class CityConstractor {
    public static void buildCities() {

        City[] cityArray = new City[10];
        cityArray[0] = new City("msk", 444);
        cityArray[1] = new City("vrn", 50000);
        cityArray[2] = new City("spb", 60000);
        cityArray[3] = new City();
        cityArray[4] = new City("lpzk", 80000);
        cityArray[5] = new City("brnsk", 90000);
        cityArray[6] = new City("omsk", 110000);
        cityArray[7] = new City("london", 50);
        cityArray[8] = new City("brat", 60);
        cityArray[9] = new City("antaliya", 70);

        for (int i = 0; i < cityArray.length; i++) {
            // неявно выполняется sheepArray[i].toString();
            System.out.println(cityArray[i]);
        }
    }
}