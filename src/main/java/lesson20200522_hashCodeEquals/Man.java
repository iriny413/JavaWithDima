package main.java.lesson20200522_hashCodeEquals;

import java.util.Objects;

public class Man {
    public static int age;
    public static int dnaCode;
    public static String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man that = (Man) o;
        return Objects.equals(dnaCode, that.dnaCode) &&
                Objects.equals(age, that.age) &&
                Objects.equals(name, that.name);
    }
//    @Override
//    public boolean equals(final Object o)
//    {
//        if (this == o)
//        {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass())
//        {
//            return false;
//        }
//        final Man man = (Man)o;
//        return dnaCode == man.dnaCode &&
//                age == man.age;
//    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + dnaCode;
        result = prime * result + age;
        return result;//961
        //return Objects.hash(collar, age);
    }

    @Override
    public String toString() {
        return "Man{" + "name='" + name + '\'' +
                ", dnaCode='" + dnaCode + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
//    public int hashCode() {
//        return super.hashCode();
//    }

//    public boolean equals(Man man) {
//        return this.dnaCode == man.dnaCode;
//    }

    /**
     * public boolean equals(Object obj) {
     *    return (this == obj);
     * }
     public boolean equals(Man man) {
     return this.dnaCode ==  man.dnaCode;
     }
     */

}

