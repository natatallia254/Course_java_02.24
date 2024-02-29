package school.lesson6;

import java.io.*;

public class SaveFile {
    public void save(AppData appdata) throws IOException {   //Метод записи в файл
        System.out.println("Запись в файл...");
        BufferedWriter writer = null;
        try {
            File file = new File("dz6.csv");
            if (!file.exists())
                file.createNewFile();
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));

            for (int i = 0; i < appdata.dataHeader().length; i++) {
                if (i != appdata.dataHeader().length - 1) {
                    writer.write(appdata.dataHeader()[i] + "; ");
                } else {
                    writer.write(appdata.dataHeader()[i]);
                }
            }
            writer.newLine();

            for (int i = 0; i < appdata.dataArray().length; i++) {
                for (int j = 0; j < appdata.dataArray()[i].length; j++) {
                    if (j != appdata.dataArray()[i].length - 1) {
                        writer.write(appdata.dataArray()[i][j] + "; ");
                    } else {
                        writer.write(appdata.dataArray()[i][j] + "");
                    }
                }
                writer.newLine();
            }

        } catch (IOException ex) {
            System.out.println("Ошибка: " + ex);
            ex.printStackTrace();

        } finally {
            writer.close();
            System.out.println("Программа записи файла закончена");
        }
    }
}
