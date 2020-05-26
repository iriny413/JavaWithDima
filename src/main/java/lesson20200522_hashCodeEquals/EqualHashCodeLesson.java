package main.java.lesson20200522_hashCodeEquals;

import java.sql.SQLOutput;

public class EqualHashCodeLesson {

    public static void showMan() {
        Man man1 = new Man();
        man1.age = 25;
        man1.dnaCode = 1111222233;

        Man man2 = new Man();
        man2.age = 25;
        man2.dnaCode = 1111222233;
        System.out.println(man1.age);
        System.out.println(man2.age);
        System.out.println("man1.equals(man2) " + man1.equals(man2));
        System.out.println("man1.hashCode() " + man1.hashCode());
        System.out.println("man2.hashCode() " + man2.hashCode());


    }
}
