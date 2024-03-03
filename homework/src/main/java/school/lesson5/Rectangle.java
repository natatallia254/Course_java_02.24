package school.lesson5;

public class Rectangle extends Figure implements SquareFigure, PerimeterFigure {
    private double a;   //Одна сторона прямоугольника
    private double b;   //Вторая сторона прямоугольника

    public Rectangle(String backgrColor, String borderColor, double a, double b) {
        super(backgrColor, borderColor);
        this.a = a;
        this.b = b;
    }

    public void figureInfo() {   //Цвета фона и границы прямоугольника
        System.out.println("Цвет фона " + getBackgrColor() + ", цвет границы " + getBorderColor() + " прямоугольника");
    }

    @Override
    public void square() {   //Вычисление площади прямоугольника
        if (a > 0 && b > 0) {
            double S = a * b;
            String result = String.format("%.2f", S);
            System.out.println("Площадь прямоугольника S = " + result);
        } else if (a <= 0 || b <= 0)
            System.out.println("Стороны прямоугольника при вычислении площади должны быть положительными и не равными нулю!");
    }

    @Override
    public void perimeter() {   //Вычисление периметра прямоугольника
        if (a > 0 && b > 0) {
            double Pe = 2 * (a + b);
            String result = String.format("%.2f", Pe);
            System.out.println("Периметр прямоугольника P = " + result);
        } else if (a <= 0 || b <= 0)
            System.out.println("Стороны прямоугольника при вычислении периметра должны быть положительными и не равными нулю!");
    }
}
