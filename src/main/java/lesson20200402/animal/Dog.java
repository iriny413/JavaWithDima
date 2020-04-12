package main.java.lesson20200402.animal;

public class Dog {

    public static String breed = "sheep dog";
    public static String name = "blackJack";
    public static int age = 2;
    public static String sex = "male";
    public static String favouritePlaything = "cow tail";

    public static String getName(){
        return name;
    }

    public static String getSex(){
        return sex;
    }

    public static String getFavouritePlaything(){
        return favouritePlaything;
    }

    /**
     * выводит в консоль любое сообщение от собаки
     */
    public static void gaf(String message) {
        System.out.println(message);
    }

    /**
     * возвращает возраст собаки
     */
    public static int getAge() {
        return age;
    }

    /**
     * добавляет собаке указанное количество лет.
     * Если итоговое значение больше 200, то в консоль выводится сообщение
     * "Что-то здесь не так" и возраст остается прежним.
     */
    public static void appendYear(int count) {
        if ((age + count) > 200) {
            System.out.println("Something went wrong");
        }
        else{
            int updatedAge = age + count;
            System.out.println(updatedAge);
        }
    }

    public static boolean guessAge(int[] optionArray) {
        boolean result = false;
        for (int i = 0; i < optionArray.length; i++) {
            if (optionArray[i] == age) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public static String getBreed(){
        return breed;
    }
}

//В package animal\ создать класс Dog.
// Добавить static поля: порода, кличка, возраст, пол, любимая игрушка(тип String).
// Каждому из полей присвоить значения по умолчанию. Добавить методы:
//public static void gaf() - выводит в консоль любое сообщение от собаки
//public static String getAge() - возвращает возраст собаки
//public static void appendYear(int count) - добавляет собаке указанное количество лет.
// Если итоговое значение больше 200, то в консоль выводится сообщение
// "Что-то здесь не так" и возраст остается прежним.
//public static boolean guessAge(int[] optionArray) - принимает на вход массив вариантов.
// Если среди этих вариантов есть возраст собаки - возвращать из метода true, иначе false.
// Добавить в класс Person метод playWithDog(). Вызвать все методы Dog в этом методе.
//        придумать пару интересных методов самостоятельно