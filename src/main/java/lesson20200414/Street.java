package main.java.lesson20200414;

import java.sql.SQLOutput;
import java.util.Objects;

public class Street extends Object {
    /**
     * Реализовать класс Street, явно наследовать от класса Object.
     * Добавить поля name, description, key. реализовать 3 контруктора:
     * без аргументов, со всеми агрументами, только с полем name.
     * Перепределить метод toString().
     * Создать массив с 10 экземплярами класса Street.
     * Вывести информацию о каждой из улиц в консоль, используя метод toString().
     * При создании нового экземпляра класса,
     * должно выводиться новое сообщение: "New street in the our city!".
     */
    private String name = "defaultName";
    private String description = "defDescription";
    private int key = 1;

    public Street() {
        System.out.println("\"New street in our city!\"");
    }

    public Street(String name, String description, int key) {
        System.out.println("New street in our city! all");
        this.name = name;
        this.description = description;
        this.key = key;
    }

    public Street(String name) {
        System.out.println("New street in the our city! name");
        this.name = name;
    }

    public String toString() {
        return name + " " + description + " " + key;
    }


    /**
     * В классе Street переопределить метод equals.
     * Создать массив из 15 улиц, которые могут повторятся.
     * Написать метод, public int checkStreetCopiesCount(Street[] array, Street street),
     * который количество эквивалентных улиц, найденных в массиве. (
     * использовать цикл for 1 раз).
     */
    public boolean equals(final Object o) {

        final Street street = (Street) o;
        if (this.key == street.key && Objects.equals(this.name, street.name) &&  Objects.equals(this.description, street.description)) {
            return true;
        } else {
            return false;
        }
    }
}
