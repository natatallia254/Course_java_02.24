package school.lesson4;

public class MainEmployee {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Иванов Иван Иванович", "Инженер", "ivanovv@gmail.com", "8-044-789-74-23", 1000.025, 45);
        employee[1] = new Employee("Петров Петр Петрович", "Конструктор", "petrov@gmail.com", "8-029-695-12-58", 700.15, 32);
        employee[2] = new Employee("Александрова Ирина Витальевна", "Учитель", "alekstut@yandex.ru", "8-033-597-78-65", 500.45, 52);
        employee[3] = new Employee("Михалев Юрий Анатольевич", "Директор", "mixayura@gmail.com", "8-044-777-88-99", 850.56, 30);
        employee[4] = new Employee("Николаева Василиса Игоревна", "Маркетолог", "nikolaeva@yandex.ru", "8-033-255-34-81", 600.1, 25);
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
        for (Employee person : employee)
            person.infoPrint();
    }

}
