package school.lesson9;

import java.util.ArrayList;
import java.util.Collections;

public class TaskTwo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Highload", "High", "Load", "Highload");
        System.out.println("Заданная коллекция:\n" + list);

        long result = list.stream()
                .filter(w -> w == "High")
                .count();
        System.out.println("Объект \"High\" встречается в колекции " + result + " раз");

        String first = list.stream()
                .findFirst()
                .orElse("0");
        System.out.println("Первый элемент коллекции: " + first);

        String last = list.stream()
                .reduce((m, n) -> n)
                .orElse("0");
        System.out.println("Последний элемент коллекции: " + last);

    }

}
