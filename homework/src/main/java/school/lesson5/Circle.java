package school.lesson5;

public class Circle implements Figure {
    private double r;   //Радиус круга
    private String backgrColor;   //Цвет фона круга
    private String borderColor;   //Цвет границы круга

    public Circle(double r, String backgrColor, String borderColor) {
        this.r = r;
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
