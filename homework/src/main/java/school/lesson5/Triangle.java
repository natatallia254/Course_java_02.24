package school.lesson5;

public class Triangle implements Figure {
    private double a;   //Одна сторона треугольника
    private double b;   //Вторая сторона треугольника
    private double c;   //Третья сторона треугольника
    private String backgrColor;   //Цвет фона треугольника
    private String borderColor;   //Цвет границы треугольника

    public Triangle(double a, double b, double c, String backgrColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
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
    public void square() {   //Вычисление площади треугольника
        if (a > 0 && b > 0 && c > 0 && a < b + c && b < a + c && c < a + b) {
            double p = (a + b + c) / 2;
            double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            String result = String.format("%.2f", S);
            System.out.println("Площадь треугольника S = " + result);
        } else if (a <= 0 || b <= 0 || c <= 0)
            System.out.println("Стороны треугольника при вычислении площади должны быть положительными и не равными нулю!");
        else if (a >= b + c || b >= a + c || c >= a + b)
            System.out.println("Каждая сторона треугольника должна быть меньше сумме двух других сторон! Проверьте корректность введенных сторон трегольника!");
    }

    @Override
    public void perimeter() {   //Вычисление периметра треугольника
        if (a > 0 && b > 0 && c > 0 && a < b + c && b < a + c && c < a + b) {
            double Pe = a + b + c;
            String result = String.format("%.2f", Pe);
            System.out.println("Периметр треугольника P = " + result);
        } else if (a <= 0 || b <= 0 || c <= 0)
            System.out.println("Стороны треугольника при вычислении периметра должны быть положительными и не равными нулю!");
        else if (a >= b + c || b >= a + c || c >= a + b)
            System.out.println("Каждая сторона треугольника должна быть меньше сумме двух других сторон! Проверьте корректность введенных сторон трегольника!");
    }
}
