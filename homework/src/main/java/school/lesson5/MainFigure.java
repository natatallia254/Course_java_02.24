package school.lesson5;

public class MainFigure {
    public static void main(String[] args) {
        //Круг
        System.out.println("Круг");
        Circle circle = new Circle("зеленый", "красный", 7.8745);
        circle.perimeter();
        circle.square();
        circle.figureInfo();
        System.out.println();

        //Прямоугольник
        System.out.println("Прямоугольник");
        Rectangle rectangle = new Rectangle("белый", "черный", 25.8, 70);
        rectangle.perimeter();
        rectangle.square();
        rectangle.figureInfo();
        System.out.println();

        //Треугольник
        System.out.println("Треугольник");
        Triangle triangle = new Triangle("оранжевый", "голубой", 9.87423, 7.896, 3.741);
        triangle.perimeter();
        triangle.square();
        triangle.figureInfo();
    }
}
