package main.java.lesson20200522_hashCodeEquals;

import java.util.Objects;

public class Man {
    public int age;
    public int dnaCode;
    public String name;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Man that = (Man) o;
//        return Objects.equals(dnaCode, that.dnaCode) &&
//                Objects.equals(age, that.age) &&
//                Objects.equals(name, that.name);
//    }
//
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + dnaCode;
//        result = prime * result + age;
//        return result;//961
//        //return Objects.hash(collar, age);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return age == man.age &&
                dnaCode == man.dnaCode &&
                Objects.equals(name, man.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, dnaCode, name);
    }

    @Override
    public String toString() {
        return "Man{" + "name='" + name + '\'' +
                ", dnaCode='" + dnaCode + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

