package main.java.lesson20200423;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLesson {
    /**
     * Создать ArrayList типа Sheep,
     * в который добавить 10 новых овец с именами "1", "2"..."10".
     * Создать второй ArrayList.
     * Поместить в него все элементы 1 коллекции и добавить 3 дополнительных с именами:
     * "101", "102", "103". Вывести в консоль вторую коллекцию.
     * Заменить во второй коллекции элементы с индексами с 3 по 7 новыми, с именами
     * "301", "302".. "305".
     * Вывести в консоль вторую коллекцию.
     * Заменить во второй коллекции все элементы,
     * имена которых содержат "1" внутри себя на значение "updated".
     * Вывести в консоль вторую коллекцию.
     */
    public static void arrayListMethods() {
        List<Sheep> sheepList1 = new ArrayList<>(9);
        sheepList1.add(0, new Sheep());
        sheepList1.add(1, new Sheep());
        sheepList1.add(2, new Sheep());
        sheepList1.add(3, new Sheep());
        sheepList1.add(4, new Sheep());
        sheepList1.add(5, new Sheep());
        sheepList1.add(6, new Sheep());
        sheepList1.add(7, new Sheep());
        sheepList1.add(8, new Sheep());
        sheepList1.add(9, new Sheep());
        System.out.println(sheepList1 + " " + sheepList1.size());

        List<Sheep> sheepList2 = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
        sheepList2.add(new Sheep());
        }
        sheepList2.add(new Sheep());
        sheepList2.add(new Sheep());
        sheepList2.add(new Sheep());

        System.out.println(sheepList1 + " " + sheepList2.size());
    }

}
