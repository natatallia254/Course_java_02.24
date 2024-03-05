package school.lesson7;

public class Data {
    public int calculation(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != 4 || arr[i].length != 4) {
                    throw new MyArraySizeException("Размерность массива не соответствует 4 x 4!");
                }
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, "Невозможно суммировать все элементы массива! Исправьте наполнение ячейки: \"" + i + " x " + j + "\"");
                }
            }
        }
        return sum;
    }

}

