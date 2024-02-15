package school.lesson3;

import java.util.Scanner;

public class Lesson3Main {
    public static void main(String[] args) {
        //task_1();
        //System.out.println(task_1_1(-20, 3));
        //task_2(0);
        //System.out.println(task_3(-10));
        //task_4("Приветулечки тебе!", 6);
        System.out.println(task_5());
        //task_6();
        //task_7();
        //task_8();
        //task_9();
        //task_10(15, 10);
    }

    public static void task_1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе целое число: ");
        int b = sc.nextInt();
        if (a + b >= 10 && a + b <= 20)
            System.out.println("true");
         else
            System.out.println("false");

        sc.close();
        System.out.println();
    }

    public static boolean task_1_1(int m, int n) {
        if (m + n >= 10 && m + n <= 20)
            return true;
         else
            return false;
    }

    public static void task_2(int a) {
        if (a >= 0)
            System.out.println("Число a = " + a + " положительное");
        else
            System.out.println("Число a = " + a + " отрицательное");
        System.out.println();
    }

    public static boolean task_3(int q){
        if (q >= 0)
            return false;
        else
            return true;
    }

    public static void task_4(String txtToPrint, int k) {
        for (int i = 0; i < k; i++)
            System.out.println(txtToPrint);
        System.out.println();
    }

    public static boolean task_5() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scan.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void task_6() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный одномерный массив:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Заменим 0 на 1, 1 на 0:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i] = 1;
            else if (arr[i] == 1)
                arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void task_7() {
        int[] arr = new int[100];
        System.out.println("Массив размерностью 100 с упорядоченными элементами от 1 до 100:");
        int counter = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = counter;
            System.out.print(arr[i] + " ");
            counter++;
        }
        System.out.println();
    }

    public static void task_8() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный одномерный массив:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Умножим числа массива, которые меньше 6-ти, на 2:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void task_9() {
        int[][] arr = new int[6][6];
        System.out.println("Массив нулей, заполненный 1-ми по диагоналям:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i + j == arr.length - 1)
                    arr[i][j] = 1;
                else
                    arr[i][j] = 0;
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void task_10(int len, int initialValue) {
        int[] arr = new int[len];
        System.out.println("Одномерный массив размерностью " + len + " со значениями элементов " + initialValue + ":");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
