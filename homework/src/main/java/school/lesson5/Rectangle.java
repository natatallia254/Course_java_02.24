package school.lesson5;

public class Rectangle implements Figure {
    private double a;   //Одна сторона прямоугольника
    private double b;   //Вторая сторона прямоугольника
    private String backgrColor;   //Цвет фона прямоугольника
    private String borderColor;   //Цвет границы прямоугольника

    public Rectangle(double a, double b, String backgrColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.backgrColor = backgrColor;
        this.borderColor = borderColor;
    }

    public String getBackgrColor() {
        return backgrColor;
    }

    public String getBorderColor() {
        return borderColor;
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
