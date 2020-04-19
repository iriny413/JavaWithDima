package main.java.lesson20200407_location;

public class City {
    public static String name = "default";
    public static int size = 0;


    public City (String newName, int newSize) {
        name = newName;
        size = newSize;
        System.out.println("Hi!!");
    }

    public String toString()
    {
        return "City{" +
                "newName='" + name + '\'' +
                ", newSize=" + size +
                '}';
    }
}
