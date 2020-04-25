package main.java.lesson20200414;

public class EqualsStreet {

    public static int checkStreetCopiesCount(Street[] array, Street street) {


        int sameStreetCounter = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("New street is " + array[i]);
            if (array[i].equals(array[i++])) {
                sameStreetCounter = i + 1;
                System.out.println("Equal!");
            }
            else{
                System.out.println("Not equal!");
            }
        }
     return sameStreetCounter;
    }
}
