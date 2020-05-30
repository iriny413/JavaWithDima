package main.java.lesson2020430_Interface;

public class Plane implements Repairable {

    boolean isNeedRepair = true;
    int costOfRepair = 500;

    @Override
    public void repair(int cash) {
        if (cash >= 500) {
            boolean isNeedRepair = false;
        }else{
            costOfRepair = costOfRepair-cash;
            System.out.println("Нужны еще деньги");
        }
    }

    @Override
    public boolean isNeedToRepair() {
        return false;
    }
}
