package school.lesson7;

public class MyArrayDataException extends Exception {
    private int i;
    private int j;

    MyArrayDataException(int i, int j, String message) {
        super(message);
        this.i = i;
        this.j = j;
    }

}
