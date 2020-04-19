package main.java.lesson20200407;

public class City {
    public static String name = "default";
    public static int size = 0;

   public City (String newName, int newSize){
       name = newName;
       size = newSize;
    }

    public static City c1 = new City("Voronezh", 1000000);
    City c2 = new City("Paris", 500000);
    City c3 = new City("Toronto", 2000000);
    City c4 = new City("Minsk", 3000000);
    City c5 = new City("Smolensk", 4000000);
    City c6 = new City("Ierusalim", 6000000);
    City c7 = new City("Sankt-Peterburg", 7000000);

    public String toString()
    {
        return "City{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}

