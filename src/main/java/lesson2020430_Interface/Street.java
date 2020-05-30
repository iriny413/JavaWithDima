package main.java.lesson2020430_Interface;

public class Street implements Repairable {

    @Override
    public void repair(int cash) {
        System.out.println("Street: Не хватает денег!");
    }

    @Override
    public boolean isNeedToRepair() {
        return false;
    }

    @Override
    public String toString() {
        return "Street{}";
    }
}
