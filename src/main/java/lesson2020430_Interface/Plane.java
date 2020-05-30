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
            System.out.println("Plane: Нужны еще деньги");
        }
    }

    @Override
    public boolean isNeedToRepair() {
        return false;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "isNeedRepair=" + isNeedRepair +
                ", costOfRepair=" + costOfRepair +
                '}';
    }
}
