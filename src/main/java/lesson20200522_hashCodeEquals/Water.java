package main.java.lesson20200522_hashCodeEquals;

import java.util.Objects;

public class Water {
    boolean sweet = true;
    int min = 10;
    int chem = 5;
    String name = "Arhiz";

    void Water(boolean sweet, int min, int chem, String name) {
        System.out.println("hi");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Water water = (Water) o;
        return sweet == water.sweet &&
                min == water.min &&
                chem == water.chem &&
                Objects.equals(name, water.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sweet, min, chem, name);
    }

    @Override
    public String toString() {
        return "Water{" +
                "sweet=" + sweet +
                ", min=" + min +
                ", chem=" + chem +
                ", name='" + name + '\'' +
                '}';
    }
}
