package school.lesson6;

public class AppData {
    private String[] header;   //Массив заголовков
    private int[][] data;      //Массив данных

    public String[] dataHeader() {
        String[] header = new String[3];
        header[0] = "Value 1";
        header[1] = "Value 2";
        header[2] = "Value 3";
        return header;
    }

    public int[][] dataArray() {
        int[][] data = new int[2][3];
        data[0][0] = 100;
        data[0][1] = 200;
        data[0][2] = 123;
        data[1][0] = 300;
        data[1][1] = 400;
        data[1][2] = 500;
        return data;
    }
}
