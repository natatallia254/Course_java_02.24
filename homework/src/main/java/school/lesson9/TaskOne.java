package school.lesson9;

import java.util.Random;
import java.util.stream.IntStream;

public class TaskOne {
    public static void main(String[] args) {
        Random random = new Random();
        int[] num = random.ints(20, -100, 100).toArray();
        System.out.println("Исходный массив 20-ти случайно сгенерированных чисел в диапазоне от -100 до 100:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        long result = IntStream.of(num)
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("\nКоличество четных чисел массива: " + result);
    }
}
