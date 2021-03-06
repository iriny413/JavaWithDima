package main.java.lesson20200423_TryCatch_ArrayList;

public class TryCatchLesson {

    public static void startLessonExample() {

        Animal[] animals = new Animal[5];
        animals[0] = new Tiger();
        animals[1] = new Sheep();
        animals[2] = new Sheep("Dolly", 4);
        speakWithAnimals(animals);
    }

        private static void speakWithAnimals(Animal[] animals)
        {
            for (int i = 0; i < animals.length; i++)
            {
                Animal animal = animals[i];
                System.out.println("-- Start speak with animal  = " + animal + "----");
                speakWithAnimalWithTryCatch(animal);
                speakWithAnimalWithInstanceOf(animal);
            }
    }

    /**
     * Принимаем Animal. Корректно проверяем, если Tiger, то здороваемся, если Sheep - здороваемся и выполняем уникальный метод doIt
     *
     * @param animal абстрактный класс.
     */
    private static void speakWithAnimalWithInstanceOf(Animal animal)
    {
        if (animal instanceof Sheep)
        {
            Sheep sheep = (Sheep)animal;
            sheep.doIt();
            System.out.println("Hi sheep = " + sheep);
        }
        if (animal.getClass() == Tiger.class)
        {
            Tiger tiger = (Tiger) animal;
            System.out.println("Hi tiger = " + tiger);
        }
    }

    /**
     * Принимаем Animal.
     * Eсли Sheep - здороваемся и выполняем уникальный метод doIt.
     * Eсли Tiger, то падаем из try block в catch block и корректно обрабатываем исключение
     *
     * @param animal абстрактный класс.
     */
    private static void speakWithAnimalWithTryCatch(Animal animal)
    {
        try
        {
            Sheep sheep = (Sheep)animal;
            sheep.doIt();
            System.out.println("Hi sheep = " + sheep);
        }
        catch (ClassCastException exception)
        {
            System.out.println("Все уронили.Message = " + exception.getMessage());
            System.out.println();
        }
        finally
        {
            System.out.println("finnaly");
        }
    }
    /**
     * Фильруем массив, возвращаем новый массив содержащий только экземпляры класса Sheep.
     *
     * @param animals массив потомков Animal. Может содержать Tiger и Sheep.
     * @return массив содежащий только экземпляры класса Sheep из массива.
     */
    public static Sheep[] filterOnlySheep(Animal[] animals)
    {
        return null;
    }

    /**
     * Определяем, какое животное нам прислали вторым аргументом, фильтруем массив элементов, исключая животных других типов.
     * + в конце добавляем новое животное.
     *
     * @param animals массив потомков Animal. Может содержать Tiger и Sheep.
     * @param newAnimal новое животное
     *
     * @return массив содежащий только экземпляры класса Sheep или Tiger из массива + новый элемент.
     */
    public static Animal[] filterOnlySelectedAnimal(Animal[] animals, Animal newAnimal)
    {
        return null;
    }
}

