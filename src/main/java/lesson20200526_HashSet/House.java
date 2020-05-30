package main.java.lesson20200526_HashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class House {
    Street street = new Street();
    public int numberOfHouseResidents;
    public List apartmentNumber;

    @Override
    public String toString() {
        return "House{" +
                "street1=" + street +
                ", numberOfHouseResidents=" + numberOfHouseResidents +
                ", apartmentNumber=" + apartmentNumber +
                '}';
    }
}
