package school.lesson5;

public class Plate {
    private int food;

    public int getFood() {   //Количество еды в тарелке
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addFood(int countAdd) {   //Метод добавления еды в тарелку. Отрицательного количества еды в тарелке не будет, потому что мы не сможем положить такого количества, а аппетит кота не превышает количества еды в тарелке
        if (countAdd < 0)
            System.out.println("В тарелку невозможно положить отрицательного количества еды! Положите больше!");
        else if (countAdd == 0)
            System.out.println("В тарелку не положили еды! Предыдущее количество еды в тарелке " + food + " единиц еды");
        else if (countAdd > 0 && food >= 0) {
            food += countAdd;
            System.out.println("Вы положили в тарелку " + countAdd + " единиц еды. В результате в тарелке " + food + " единиц еды");
        }
    }
}
