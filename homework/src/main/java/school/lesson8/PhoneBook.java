package school.lesson8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PhoneBook {
    HashMap<String, String> directory = new HashMap<>();

    public void add(String phone, String name) {   //Метод добавления в справочник телефонных номеров и фамилий
        directory.put(phone, name);
    }

    public void get(String name) {   //Метод поиска номеров в справочнике по фамилии
        String result = (directory.containsValue(name)) ? " найден" : " не найден";
        System.out.println("Телефон абонента " + name + result);

        //Вносим в HashSet номера телефонов каждого из абонентов:
        HashSet phones = new HashSet();
        for (Map.Entry element : directory.entrySet()) {
            if (element.getValue().equals(name)) {
                phones.add(element.getKey());
            }
        }
        System.out.print(name + " / Номер(а) телефона(ов): " + phones);
        System.out.println();
    }

    public void printPhonebook() {   //Метод печати полного справочника
        System.out.println("\nТелефонный справочник:");
        for (HashMap.Entry<String, String> l : directory.entrySet()) {
            System.out.println(l.getKey() + ": " + l.getValue());
        }
        System.out.println();
    }
}
