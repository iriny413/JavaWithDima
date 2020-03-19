import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class Main {

    //    public static int sum1(int a, int b) {
//        return (a + b) * (a + b);
//    }
//
//    public static int sum2(int a, int b) {
//        return (a * a) + (2 * (a * b)) + (b * b);
//    }

    public static void main(String[] args) {

//        int[] myArray = new int[10];
//        myArray[2] = 34355;
//        for (int i = 0; i < myArray.length; i = i + 1) {
//            System.out.println(myArray[i]);
//        }

        /**
         * Задача 1
         * Вернуть сумму элементов массива
         * Пример 1.: При вызове метода с аргументами old array = {1}, результат 1
         * Пример 2.: При вызове метода с аргументами old array = {1, 2, 9, 10}, результат 22
         */
        int[] arrayElementSum1 = new int[]{1};
        int[] arrayElementSum2 = new int[]{1,2,9,10};
        int sum1;
        int sum2;
        System.out.println("Default data");
        sum1 = ArrayUtility.returnArrayElementsSum(arrayElementSum1);
        System.out.println("Задание 1.1: ");
        System.out.println(sum1);
        sum2 = ArrayUtility.returnArrayElementsSum(arrayElementSum2);
        System.out.println("Задание 1.2: ");
        System.out.println(sum2);

        /**
         * Задача 2
         * Задача метода получить на вход массив и еще одно число,
         * на выхоже вернуть новый массив, включающий все старые значения массива + новое значение
         * <p>
         * Пример 1.: При вызове метода с аргументами old array = {1}, newValue=2, результат {1, 2}
         * Пример 2.: При вызове метода с аргументами old array = {1, 2, 9, 10}, newValue=3, результат {1, 2, 9, 10, 3}
         */
        int [] oldArray = new int[1];
        oldArray[0] = 1;
        oldArray = ArrayUtility.appendNewValue(oldArray, 2);
        System.out.println("Задание 2.1: ");
        for (int i = 0; i < oldArray.length; i = i + 1) {
            System.out.println(oldArray[i]);
        }

        oldArray = new int[]{1, 2, 9, 10};
        oldArray = ArrayUtility.appendNewValue(oldArray, 3);
        System.out.println("Задание 2.2: ");
        for (int i = 0; i < oldArray.length; i = i + 1) {
            System.out.println(oldArray[i]);
        }

        /**
         * Задача 3
         * Задача метода получить на вход массив и еще одно число,
         * на выхоже вернуть новый массив, включающий все старые значения массива + новое значение
         *  Пример 1.: При вызове метода с аргументами old array = {1}, newValue=2, secondNewValue=3, результат {1, 2, 3}
         *  Пример 2.: При вызове метода с аргументами
         *      old array = {1, 2, 9, 10}, newValue=3, secondNewValue = 10000, результат {1, 2, 9, 10, 3, 10000}
         */
        int [] oldArray2 = new int[]{1};
        oldArray2 = ArrayUtility.appendNew2Values(oldArray2, 2, 3);
        System.out.println("Задание 3.1: ");
        for (int i = 0; i < oldArray2.length; i = i + 1) {
            System.out.println(oldArray2[i]);
        }

        oldArray2 = new int []{1, 2, 9, 10,};
        oldArray2 = ArrayUtility.appendNew2Values(oldArray2, 3, 1000);
        System.out.println("Задание 3.2: ");
        for (int i = 0; i < oldArray2.length; i = i + 1) {
            System.out.println(oldArray2[i]);
        }

        /**Задача 4
         * Задача метода получить на вход 2 массива,
         * на выхоже вернуть новый массив, включающий все значения обоих массивов
         *
         *  Пример 1.: При вызове метода с аргументами oldArray1 = {1, 2}, oldArray1 = {1, 3}, результат {1, 2, 1, 3}
         *  Пример 2.: При вызове метода с аргументами oldArray1 = {1, 2}, oldArray1 = {}, результат {1, 2}
         */

        int [] oldArray11 = new int []{1, 2};
        int [] oldArray12 = new int []{1, 3};
        int [] oldArray13 =  ArrayUtility.appendNewValues2Arrays(oldArray11, oldArray12);
        System.out.println("Задание 4.1: ");
        for (int i = 0; i < oldArray13.length; i = i + 1) {
            System.out.println(oldArray13[i]);
        }

        int [] oldArray4 = new int []{1, 2};
        int [] oldArray5 = new int []{};
        int [] oldArray6 =  ArrayUtility.appendNewValues2Arrays(oldArray4, oldArray5);
        System.out.println("Задание 4.2: ");
        for (int i = 0; i < oldArray6.length; i = i + 1) {
            System.out.println(oldArray6[i]);
        }
        /**Задача 5
         * Задача метода получить на вход массив и еще одно число,
         * на выхоже вернуть новый массив, в котором не будет значений равных value
         *  Пример 1.: При вызове метода с аргументами old array = {1, 1, 1, 1}, value=2, результат {1, 1, 1, 1}
         *  Пример 1.: При вызове метода с аргументами old array = {2, 100, 12, 2}, value=2, результат {100, 12}
         */
        int [] oldArray7 = new int[]{1,1,1,1};
        oldArray7 = ArrayUtility.deleteAllSameValuesFromArray(oldArray7, 2);
        System.out.println("Задание 5.1: ");
        for (int i = 0; i < oldArray7.length; i = i + 1) {
            System.out.println(oldArray7[i]);
        }
        int [] oldArray8 = new int[]{2, 100, 12, 2};
        oldArray8 = ArrayUtility.deleteAllSameValuesFromArray(oldArray8, 2);
        System.out.println("Задание 5.1: ");
        for (int i = 0; i < oldArray7.length; i = i + 1) {
            System.out.println(oldArray8[i]);
        }
        /**Задача6
         * Задача метода получить на вход 2 массива,
         * на выхоже вернуть новый массив, включающий все значения обоих массивов, без повторов
         *  Пример 1.: При вызове метода с аргументами oldArray1 = {1, 2}, oldArray1 = {1, 3}, результат {1, 2, 3}
         *  Пример 2.: При вызове метода с аргументами oldArray1 = {11, 2}, oldArray1 = {10000}, результат {11, 2, 10000}
         */
//    public static int[] appendAllUniqueValues(int[] oldArray1, int[] oldArray2)
//    {
//        return oldArray1;
//    }

        /**Задача 7
         * Задача метода получить на вход массив и еще одно число,
         * на выхоже вернуть новый массив, в котором будет присутствовать новое значение и массив будет отсортирован по возрастанию
         *  Пример 1.: При вызове метода с аргументами old array = {1, 1, 1, 1}, value=2, результат {1, 1, 1, 1, 2}
         *  Пример 1.: При вызове метода с аргументами old array = {2, 100, 12}, value=22, результат {2, 12, 22, 100}
         */

//        int [] oldArrayA = new int[]{1, 1, 1, 1};
//        oldArrayA = ArrayUtility.appendNewValueAndSort(oldArrayA, 2);
//        System.out.println("Задание 7.1: ");
//        for (int i = 0; i < oldArrayA.length; i = i + 1) {
//            System.out.println(oldArrayA[i]);
//        }
//
//        int [] oldArrayB = new int[]{2, 100, 12};
//        oldArrayB = ArrayUtility.appendNewValueAndSort(oldArrayB, 22);
//        System.out.println("Задание 7.2: ");
//        for (int i = 0; i < oldArrayB.length; i = i + 1) {
//            System.out.println(oldArrayB[i]);
//        }

//        System.out.println(args[1]);
//        System.out.println(args[2]);
//        System.out.println(args[3]);

//        for (int i = 0; i < args.length; i=i+1){
//            System.out.println(args[i]);
//        }


//        int a = 3;
//        int b = 4;
//        int c;
//        int m;
//        int mul;
//        int d;
//        c = Calculator.sum(a, b);
//        m = Calculator.minus(a, b);
//        mul = Calculator.multiply(a, b);
//        d = Calculator.div(a, b);
//        System.out.println(c);
//        System.out.println(Calculator.minus(a, b));
//        System.out.println(mul);
//        System.out.println(d);
//        int a = 1000;
//        int b = 2;
//        int leftSideResult;
//
//        leftSideResult = sum1(a, b);
//
//        int rightSideResult;
//
//        rightSideResult = sum2(a, b);
//
//        boolean correctResultOrNot = (leftSideResult == rightSideResult);
//        System.out.println("left side = ");
//        System.out.println(leftSideResult);
//        System.out.println("right side = ");
//        System.out.println(rightSideResult);
//        System.out.println("The both results are equal: ");
//        System.out.println(correctResultOrNot);

    }
}