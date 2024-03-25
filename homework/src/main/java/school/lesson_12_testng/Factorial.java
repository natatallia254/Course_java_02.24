package school.lesson_12_testng;

public class Factorial {
    public int count(int n) {
        int result = 1;
        for (int i = 1; i < n; i++) {
            result = result * (i + 1);

        }
        return result;
    }
}
