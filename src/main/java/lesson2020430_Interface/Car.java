package main.java.lesson2020430_Interface;

public class Car implements Repairable {
    boolean isNeedRepair = true;

    @Override
    public void repair(int cash) {
        if (cash > 10) {
            System.out.println("Car: Отремонтированно");
            boolean isNeedRepair = false;
        }
    else{
                System.out.println("Car: Не хватает денег");
            }
        }

    @Override
    public boolean isNeedToRepair() {
        return false;
    }

    @Override
    public String toString() {
        return "Car{" +
                "isNeedRepair=" + isNeedRepair +
                '}';
    }
}
