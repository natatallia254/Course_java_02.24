package school.lesson6;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            AppData appdata = new AppData();
            SaveFile savefile = new SaveFile();
            savefile.save(appdata);   //Запись в файл
            System.out.println();
            LoadFile loadfile = new LoadFile();
            loadfile.load();   //Чтение из файла
            System.out.println();
        } catch (IOException ex) {
            System.out.println("Ошибка: " + ex);
            ex.printStackTrace();
        } finally {
            System.out.println("Программа записи и чтения файла закончена");
        }

    }
}
