package main.java.lesson20200526_HashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class House {
    public Street street;
    public int numberOfHouseResidents;
    public List apartmentNumber;

    @Override
    public String toString() {
        return "House{" +
                "street=" + street +
                ", numberOfHouseResidents=" + numberOfHouseResidents +
                ", apartmentNumber=" + apartmentNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return numberOfHouseResidents == house.numberOfHouseResidents &&
                Objects.equals(street, house.street) &&
                Objects.equals(apartmentNumber, house.apartmentNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, numberOfHouseResidents, apartmentNumber);
    }
}

