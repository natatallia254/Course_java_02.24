package school.lesson5;

public class Figure {
    private String backgrColor;   //Цвет фона
    private String borderColor;   //Цвет границы

    public Figure(String backgrColor, String borderColor) {
        this.backgrColor = backgrColor;
        this.borderColor = borderColor;
    }

    public String getBackgrColor() {
        return backgrColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void figureInfo() {   //Цвет фона и границы фигуры (переопределим этот метод в классах-наследниках)
        System.out.println("Цвет фона " + backgrColor + ", цвет границы " + borderColor + " абстрактной фигуры");
    }
}
