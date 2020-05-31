package main.java.lesson20200423_TryCatch_ArrayList;

public class Sheep extends Animal{

    public String name = "default name";
    private int age = 0;

    public Sheep (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Sheep(){}

    public Sheep(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doIt()
    {
        System.out.println("doIT");
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
