package main.java.lesson20200526_HashSet;

import java.util.Objects;

public class Street {
    int number = 0;
    String name = "to be defined";

    public Street(int number, String name) {
        System.out.println("nice street!");
    }

    @Override
    public String toString() {
        return "Street{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Street street = (Street) o;
        return number == street.number &&
                Objects.equals(name, street.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }
}
