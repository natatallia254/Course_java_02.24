package school.lesson5;

public class Circle extends Figure implements SquareFigure, PerimeterFigure {
    private double r;   //Радиус круга

    public Circle(String backgrColor, String borderColor, double r) {
        super(backgrColor, borderColor);
        this.r = r;
    }

    public void figureInfo() {   //Цвета фона и границы круга
        System.out.println("Цвет фона " + getBackgrColor() + ", цвет границы " + getBorderColor() + " круга");
    }

    @Override
    public void square() {   //Вычисление площади круга
        if (r > 0) {
            double S = Math.PI * Math.pow(r, 2);
            String result = String.format("%.2f", S);
            System.out.println("Площадь круга S = " + result);
        } else
            System.out.println("Радиус окружности при вычислении площади круга должен быть положительным и не равным нулю!");
    }

    @Override
    public void perimeter() {   //Вычисление длины окружности круга
        if (r > 0) {
            double l = 2 * Math.PI * r;
            String result = String.format("%.2f", l);
            System.out.println("Длина окружности l = " + result + " круга");
        } else
            System.out.println("Радиус окружности при вычислении длины окружности должен быть положительным и не равным нулю!");
    }
}
