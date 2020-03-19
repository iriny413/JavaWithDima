import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayUtility {

    /**
     * Задача 1
     * Вернуть сумму элементов массива
     * Пример 1.: При вызове метода с аргументами old array = {1}, результат 1
     * Пример 2.: При вызове метода с аргументами old array = {1, 2, 9, 10}, результат 22
     */

    public static int returnArrayElementsSum(int[] arrays) {
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum = sum + arrays[i];
        }
        return sum;
    }

    /**
     * Задача 2
     * Задача метода получить на вход массив и еще одно число,
     * на выхоже вернуть новый массив, включающий все старые значения массива + новое значение
     * <p>
     * Пример 1.: При вызове метода с аргументами old array = {1}, newValue=2, результат {1, 2}
     * Пример 2.: При вызове метода с аргументами old array = {1, 2, 9, 10}, newValue=3, результат {1, 2, 9, 10, 3}
     */
    public static int[] appendNewValue(int[] oldArray, int newValue) {
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length - 1] = newValue;
        return newArray;
    }
//        oldArray = Arrays.copyOf(oldArray, oldArray.length + 1);
//        oldArray[oldArray.length - 1] = newValue;
//        return oldArray;
//    }

    /**
     * Задача 3
     * Задача метода получить на вход массив и еще одно число,
     * на выхоже вернуть новый массив, включающий все старые значения массива + новое значение
     * <p>
     * Пример 1.: При вызове метода с аргументами old array = {1}, newValue=2, secondNewValue=3, результат {1, 2, 3}
     * Пример 2.: При вызове метода с аргументами
     * old array = {1, 2, 9, 10}, newValue=3, secondNewValue = 10000, результат {1, 2, 9, 10, 3, 10000}
     */
    public static int[] appendNew2Values(int[] oldArray, int newValue, int secondNewValue) {
        int[] result;
        result = appendNewValue(oldArray, newValue);
        result = appendNewValue(result, secondNewValue);
        return result;
    }
//        oldArray = Arrays.copyOf(oldArray, oldArray.length + 2);
//        oldArray[oldArray.length - 1] = secondNewValue;
//        oldArray[oldArray.length - 2] = newValue;
//        return oldArray;
//    }

    /**
     * Задача 4
     * Задача метода получить на вход 2 массива,
     * на выхоже вернуть новый массив, включающий все значения обоих массивов
     * <p>
     * Пример 1.: При вызове метода с аргументами oldArray1 = {1, 2}, oldArray1 = {1, 3}, результат {1, 2, 1, 3}
     * Пример 2.: При вызове метода с аргументами oldArray1 = {1, 2}, oldArray1 = {}, результат {1, 2}
     */
    public static int[] appendNewValues2Arrays(int[] oldArray1, int[] oldArray2) {
        int[] newArray = new int[oldArray1.length + oldArray2.length];
        for (int i = 0; i < oldArray1.length; i++) {
            newArray[i] = oldArray1[i];
        }
            for (int i = oldArray1.length; i < newArray.length; i++) {
                newArray[i] = oldArray2[i-oldArray1.length];
        }
        return newArray;
    }
//        int l = oldArray2.length;
//        oldArray1 = Arrays.copyOf(oldArray1, oldArray1.length + l);
//        if (l == 0) {
//            return oldArray1;
//        } else {
//            oldArray1[oldArray1.length - 1] = oldArray2[1];
//            oldArray1[oldArray1.length - 2] = oldArray2[0];
//            return oldArray1;
//        }
//    }


    /**
     * Задача 5
     * Задача метода получить на вход массив и еще одно число,
     * на выхоже вернуть новый массив, в котором не будет значений равных value
     * <p>
     * Пример 1.: При вызове метода с аргументами old array = {1, 1, 1, 1}, value=2, результат {1, 1, 1, 1}
     * Пример 1.: При вызове метода с аргументами old array = {2, 100, 12, 2}, value=2, результат {100, 12}
     */
    public static int[] deleteAllSameValuesFromArray(int[] oldArray, int value) {
        int[] result = new int[0];
        for (int i = 0; i < oldArray.length; i = i + 1) {
            if (i != value) {
                continue;
            }
                else{
                    result = appendNewValue(oldArray, value);
                }
        }
        return result;
    }

    /**Задача6
     * Задача метода получить на вход 2 массива,
     * на выхоже вернуть новый массив, включающий все значения обоих массивов, без повторов
     *
     *  Пример 1.: При вызове метода с аргументами oldArray1 = {1, 2}, oldArray1 = {1, 3}, результат {1, 2, 3}
     *  Пример 2.: При вызове метода с аргументами oldArray1 = {11, 2}, oldArray1 = {10000}, результат {11, 2, 10000}
     */
//    public static int[] appendAllUniqueValues(int[] oldArray1, int[] oldArray2)


    /**
     * Задача 7
     * Задача метода получить на вход массив и еще одно число,
     * на выхоже вернуть новый массив, в котором будет присутствовать новое значение и массив будет отсортирован по возрастанию
     * Пример 1.: При вызове метода с аргументами old array = {1, 1, 1, 1}, value=2, результат {1, 1, 1, 1, 2}
     * Пример 1.: При вызове метода с аргументами old array = {2, 100, 12}, value=22, результат {2, 12, 22, 100}
     */
    public static int[] appendNewValueAndSort(int[] oldArray, int value) {



        oldArray = Arrays.copyOf(oldArray, oldArray.length + 1);
        oldArray[oldArray.length - 1] = value;
        int length = oldArray.length;
        Arrays.sort(oldArray, 1, length);
        return (oldArray);
    }
}

