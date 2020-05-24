package main.java.lesson20200421;

public class Truck extends Vehicle{

    public static void drive(){
        System.out.println("The truck has started moving");
    }
    public void stop(){
        super.stop();
        System.out.println("The truck has stopped");
    }

}
