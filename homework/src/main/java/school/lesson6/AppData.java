package school.lesson6;

public class AppData {
    private String[] header;
    private int[][] data;

    public void dataFile() {

        String[] header = new String[3];
        header[0] = "Value 1";
        header[1] = "Value 2";
        header[2] = "Value 3";

        for (int i = 0; i < header.length; i++) {
            if (i != header.length - 1) {
                System.out.print(header[i] + "; ");
            } else {
                System.out.println(header[i]);
            }
        }

        int[][] data = new int[3][2];
        data[0][0] = 100;
        data[0][1] = 200;
        data[0][2] = 123;
        data[1][0] = 300;
        data[1][1] = 400;
        data[1][2] = 500;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (j != data.length - 1) {
                    System.out.print(data[i][j] + "; ");
                } else {
                    System.out.print(data[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
