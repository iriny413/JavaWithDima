package main.java.lesson20200522_hashCodeEquals;

import java.util.Objects;

public class Man {
    public static int age;
    public static int dnaCode;
    public static String name;


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

