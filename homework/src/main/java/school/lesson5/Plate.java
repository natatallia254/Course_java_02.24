package school.lesson5;

public class Plate {
    private int food;

    public int getFood() {   //Количество еды в тарелке
        return food;
    }

    public void addFood(int countAdd) {   //Метод добавления еды в тарелку. Отрицательного количества еды в тарелке не будет, потому что мы не сможем положить такого количества, а аппетит кота не превышает количества еды в тарелке
        if (countAdd < 0)
            System.out.println("В тарелку невозможно положить отрицательного количества еды! Положите больше!");
        else if (countAdd == 0)
            System.out.println("В тарелку не положили еды! Предыдущее количество еды в тарелке " + getFood() + " единиц еды");
        else if (countAdd > 0 && food >= 0) {
            food += countAdd;
            System.out.println("Вы положили в тарелку " + countAdd + " единиц еды. В результате в тарелке " + getFood() + " единиц еды");
        }
    }

    public void reducingFood(String color_, String name_, int appetite_, boolean satiety_) {   //Метод уменьшения еды в тарелке при поедании
        if (food >= appetite_ && satiety_ == false) {
            food -= appetite_;
            satiety_ = true;
            System.out.println("Кот " + color_ + " " + name_ + " поел. Осталось " + food + " единиц еды в тарелке. Его сытость: \"" + satiety_ + "\"");
        } else if (food < appetite_) {
            satiety_ = false;
            System.out.println("Аппетит кота " + name_ + " цвета \"" + color_ + "\" превышает количество еды в тарелке (количество еды в тарелке: " + food + " единиц, аппетит: " + appetite_ + " единиц). Кот обиделся и отказался есть. Его сытость: \"" + satiety_ + "\"");
        }
    }
}
