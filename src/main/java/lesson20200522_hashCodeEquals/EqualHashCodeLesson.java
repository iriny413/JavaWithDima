package main.java.lesson20200522_hashCodeEquals;

import java.sql.SQLOutput;

public class EqualHashCodeLesson {

    public static void showDiff() {
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

        Water w1 = new Water();
        w1.sweet = false;

        Water w2 = new Water();
        w2.sweet = true;

        System.out.println("Result of equals: " + w1.equals(w2));
        System.out.println("Result of hashCode1: " + w1.hashCode());
        System.out.println("Result of hashCode2: " + w2.hashCode());

        int hash1 = w1.hashCode();
        int hash2 = w2.hashCode();
        boolean hashCodeDiff = true;
        if(hash1 == hash2) {
            hashCodeDiff = true;
        }
        else {
            hashCodeDiff = false;
        }
        System.out.println(hashCodeDiff);
        }
    }
