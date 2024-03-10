package school.lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Array {
    public static void main(String[] args) {
        /*Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Реализовать с использованием коллекции*/
        ArrayList<String> fruits = new ArrayList<>();    //Создаем ArrayList
        Collections.addAll(fruits, "яблоко", "банан", "слива", "персик", "груша", "лимон", "малина", "клубника", "банан", "слива", "персик", "яблоко", "апельсин", "голубика", "черника", "яблоко", "дыня", "арбуз", "лимон", "яблоко");
        System.out.println("\nКоллекция(массив) фруктов и ягод с повторяющимися элементами:");
        fruits.stream()
                .sorted()
                .forEach(l -> System.out.print(l + " "));   //Сортируем по возрастанию и выводим отсортированную коллекцию на экран
        System.out.println();

        /*Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем)*/
        HashSet<String> uniqueFruits = new HashSet<>();   //Создаем HashSet, т.к. в него попадут только уникальные элементы, остальные отсекутся
        uniqueFruits.addAll(fruits);   //Добавляем в HashSet элементы из ArrayList
        System.out.println("\nУникальные элементы коллекции фруктов и ягод:\n" + uniqueFruits);   //Выводим эти элементы. Они уникальны

        /*Посчитать, сколько раз встречается каждое слово*/
        System.out.println("\nПодсчет фруктов и ягод по названиям:");
        HashMap<String, Integer> countRepeatFr = new HashMap<>();   //Один вариант
        for (String list : fruits) {
            countRepeatFr.put(list, countRepeatFr.getOrDefault(list, 0) + 1);
        }
        countRepeatFr.entrySet().forEach(l -> System.out.print(l + " "));
        System.out.println();

        System.out.println("\nПодсчет 2 фруктов и ягод по названиям:");
        HashMap<String, Integer> countRepeatFrTwo = new HashMap<>();   //Второй вариант
        for (String list : fruits) {
            if (countRepeatFrTwo.containsKey(list))
                countRepeatFrTwo.put(list, countRepeatFrTwo.get(list) + 1);
            else
                countRepeatFrTwo.put(list, 1);
        }
        countRepeatFrTwo.entrySet().forEach(l -> System.out.print(l + " "));
        System.out.println();

    }
}
