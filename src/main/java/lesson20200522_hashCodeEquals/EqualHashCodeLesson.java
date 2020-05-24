package main.java.lesson20200522_hashCodeEquals;

public class EqualHashCodeLesson {

    public static void showMan() {
        Man man1 = new Man();
        man1.age = 25;
        man1.dnaCode = 1111222234;

        Man man2 = new Man();
        man2.age = 25;
        man2.dnaCode = 1111222233;

        System.out.println("man1.equals(man2) " + man1.equals(man2));
        System.out.println("man1.hashCode() " + man1.hashCode());


    }
}
