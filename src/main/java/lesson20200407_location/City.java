package main.java.lesson20200407_location;

public class City {
    public String name = "default";
    public int size = 0;
    public String key = "spb";
/**
Добавить поле key(по умолчанию "spb").
 В методе main создать массив длинной 10 тип City.
 Заполнить первые 3 элемента экземплярами класса City с именами "msk", "vrn", "spb".
Вывести на экран все значения key, присутствующие в массиве.
 */

    public City (String newName, int newSize) {
        name = newName;
        size = newSize;
    }

    public City() {
        System.out.println("Hi2!!");
    }

    public String toString()
    {
        return "City{" +
                "newName='" + name + '\'' +
                ", newSize=" + size + '\'' + ", key='" + key + '\'' +
                '}';
    }
}
