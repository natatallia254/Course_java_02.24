package school.lesson5;

public interface Figure {
    void square();

    void perimeter();

    default void glow() {   //Метод свечения фигуры по дефолту
    }
}
