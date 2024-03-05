package school.lesson7;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        String[][] array = new String[][]{{"10", "9", "10", "1",}, {"1", "1", "1", "7"}, {"1", "2", "78", "1",}, {"1", "1", "7", "3"}};
        try {
            try {
                int plus = data.calculation(array);
                System.out.println("Сумма всех элементов массива: " + plus);
            } catch (MyArraySizeException e) {
                System.out.println(e.getMessage());
            }
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }
}
