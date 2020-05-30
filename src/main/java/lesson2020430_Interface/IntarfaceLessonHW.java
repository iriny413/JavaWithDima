package main.java.lesson2020430_Interface;

public class IntarfaceLessonHW {
    public static void run() {
        int cash = 100000;
        Repairable[] repairable = new Repairable[]{new Street(), new Street(), new Car(), new Plane()};


        for (int i = 0; i < repairable.length; i++) {
            repairable[i].repair(cash);
            cash = cash - 1;
            System.out.println("Цена: " + repairable[i]);
        }
    }
}