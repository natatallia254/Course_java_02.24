package school.lesson5;

public interface PerimeterFigure {
    void perimeter();

    default void additional() {   //Метод по дефолту
    }
}
