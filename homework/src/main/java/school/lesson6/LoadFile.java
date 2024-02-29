package school.lesson6;

import java.io.*;

public class LoadFile {
    public void load() throws IOException {   //Метод чтения файла
        System.out.println("Чтение файла...");
        BufferedReader reader = null;
        try {
            File file = new File("dz6.csv");
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Не удается найти указанный файл или путь. Ошибка: " + e);
            e.printStackTrace();
        } finally {
            reader.close();
            System.out.println("Программа чтения файла закончена");
        }
    }
}
