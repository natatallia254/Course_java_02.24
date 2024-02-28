package school.lesson5;

public class MainFigure {
    public static void main(String[] args) {
        //Круг
        Circle circle = new Circle(7.8745, "зеленый", "красный");
        circle.perimeter();
        circle.square();
        System.out.println("Цвет фона круга: " + circle.getBackgrColor());
        System.out.println("Цвет границы круга: " + circle.getBorderColor());
        System.out.println();

        //Прямоугольник
        Rectangle rectangle = new Rectangle(25.8, 70, "белый", "черный");
        rectangle.perimeter();
        rectangle.square();
        System.out.println("Цвет фона прямоугольника: " + rectangle.getBackgrColor());
        System.out.println("Цвет границы прямоугольника: " + rectangle.getBorderColor());
        System.out.println();

        //Треугольник
        Triangle triangle = new Triangle(7.896, 3.741, 9.87423, "оранжевый", "голубой");
        triangle.perimeter();
        triangle.square();
        System.out.println("Цвет фона треугольника: " + triangle.getBackgrColor());
        System.out.println("Цвет границы треугольника: " + triangle.getBorderColor());
        System.out.println();
    }
}
