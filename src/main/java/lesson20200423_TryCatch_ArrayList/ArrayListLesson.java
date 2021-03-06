package main.java.lesson20200423_TryCatch_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLesson {
    /**
     * Создать ArrayList типа Sheep,в который добавить 10 новых овец с именами "1", "2"..."10".
     * Создать второй ArrayList.
     * Поместить в него все элементы 1 коллекции и добавить 3 дополнительных с именами: "101", "102", "103". Вывести в консоль вторую коллекцию.
     * Заменить во второй коллекции элементы с индексами с 3 по 7 новыми, с именами "301", "302".. "305". Вывести в консоль вторую коллекцию.
     * Заменить во второй коллекции все элементы, имена которых содержат "1" внутри себя на значение "updated". Вывести в консоль вторую коллекцию.
     */
    public static void arrayListMethods() {
        ArrayList<Sheep> sheepList1 = new ArrayList<>(9);
        sheepList1.add(0, new Sheep("1"));
        sheepList1.add(1, new Sheep("2"));
        sheepList1.add(2, new Sheep("3"));
        sheepList1.add(3, new Sheep("4"));
        sheepList1.add(4, new Sheep("5"));
        sheepList1.add(5, new Sheep("6"));
        sheepList1.add(6, new Sheep("7"));
        sheepList1.add(7, new Sheep("8"));
        sheepList1.add(8, new Sheep("9"));
        sheepList1.add(9, new Sheep("10"));
        System.out.println("sheepList1 size: " + sheepList1 + " " + sheepList1.size());

        ArrayList<Sheep> sheepList2 = new ArrayList<>();
        sheepList2.addAll(0, sheepList1);
        sheepList2.add(new Sheep("101"));
        sheepList2.add(new Sheep("102"));
        sheepList2.add(new Sheep("103"));
        System.out.println("sheepList2 - add sheep: " + sheepList2 + " " + sheepList2.size());
        Sheep a = new Sheep("302");

        sheepList2.set(3, new Sheep("301"));
        sheepList2.set(4, a);
        sheepList2.set(5, new Sheep("303"));
        sheepList2.set(6, new Sheep("304"));
        sheepList2.set(7, new Sheep("305"));
        System.out.println("sheepList2 - replace sheep: " + sheepList2 + " " + sheepList2.size());

        String ab = "1";
        List arrayList3 = new ArrayList();
        arrayList3.add(new Sheep());
        arrayList3.add(ab);
        boolean is1Contains = arrayList3.contains("1");

        for (Sheep sheep: sheepList2){
            System.out.println("Is1contains in name in sheepList2 " + sheep.name.contains("1"));
            if(sheep.name.contains("1")){
                sheep.name = "UPDATED";
            }
        }
        System.out.println(" 'After updated_NEW': " + sheepList2 + "&" + sheepList2.size());

        System.out.println("List containing '1': " + sheepList2.contains("1"));
//        for(int i = 0; i< sheepList2.size(); i++){
//            if(sheepList2.get(i).getName() == "1")
//            sheepList2.get(i).setName("Updated");
        for(int i = 0; i< sheepList2.size(); i++){
            if(sheepList2.get(i).getName().contains("1"))
                sheepList2.get(i).setName("Updated");
        }
        System.out.println(" 'After updated_old': " + sheepList2 + "&" + sheepList2.size());
    }
}
