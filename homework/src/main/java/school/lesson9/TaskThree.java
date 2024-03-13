package school.lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TaskThree {
    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<>();
        Collections.addAll(elements, "f10", "a15", "f2", "f4", "f5", "b54", "a16");
        System.out.println("Заданная коллекция:\n" + elements);

        /*Collections.sort(elements, (k1,k2) -> {   //Здесь при одинаковой букве не цифры, а числа в порядке возрастания
            if (k1.charAt(0) == k2.charAt(0)) {
                int n = Integer.parseInt(k1.substring(1));
                int m = Integer.parseInt(k2.substring(1));
                return n-m;
            } else {
                return 0;
            }
        });*/

        Collections.sort(elements, (k1, k2) -> {   //Здесь при одинаковой букве цифры в порядке возрастания (не числа)
            String m = k1.replaceAll("/d", "");
            String n = k2.replaceAll("/d", "");
            if (!m.equals(n)) {
                return m.compareTo(n);
            } else {
                return Integer.parseInt(k1.replaceAll("^[0-9]", "")) - Integer.parseInt(k2.replaceAll("^[0-9]", ""));
            }
        });

        String[] arrayElements = elements.stream()
                .toArray(String[]::new);

        System.out.println("Массив отсортированных элементов:\n" + Arrays.toString(arrayElements));

    }
}
