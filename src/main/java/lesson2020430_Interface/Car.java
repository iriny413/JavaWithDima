package main.java.lesson2020430_Interface;

public class Car implements Repairable {
    boolean isNeedRepair = true;

    @Override
    public void repair(int cash) {
        if (cash > 10) {
            System.out.println("Отремонтированно");
            boolean isNeedRepair = false;
        }
    else{
                System.out.println("Не хватает денег");
            }
        }

    @Override
    public boolean isNeedToRepair() {
        return false;
    }
}
