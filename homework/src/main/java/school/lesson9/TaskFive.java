package school.lesson9;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        ArrayList<String> logins = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите логин в случае продолжения. Для завершения ничего не вводите, кроме ввода");
            String login = scanner.nextLine();
            if (login.isEmpty()) {
                break;
            }
            logins.add(login);
        }
        logins.stream()
                .filter(login -> login.startsWith("f"))
                .forEach(System.out::println);
    }
}
