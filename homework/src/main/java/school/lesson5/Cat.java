package school.lesson5;

public class Cat extends Animal {
    private boolean satiety;
    private int appetite;
    static int countCat;

    public Cat(String name, int distRun, int distSwim, boolean satiety, int appetite) {
        super(name, distRun, distSwim);
        this.satiety = satiety;
        this.appetite = appetite;
        countCat++;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void run() {   //Метод бега котов
        if (getDistRun() > 0 && getDistRun() <= 200)
            System.out.println("Кот " + getName() + " пробежал " + getDistRun() + " метр.");
        else if (getDistRun() <= 0)
            System.out.println("Кот " + getName() + " не пробежал ни одного метра");
        else
            System.out.println("Кот " + getName() + " физически не мог пробежать " + getDistRun() + " метр.");
    }

    public void swim() {   //Метод плавания котов (плавать не умеют)
        System.out.println("Кот " + getName() + " плавать не умеет, как и остальные коты!");
    }

    public void eatCat(Plate p) {   //Метод еды котов
        System.out.println("Кот " + getName() + " с изначальными сытостью \"" + satiety + "\" и аппетитом " + appetite);
        if (appetite < 0)
            System.out.println("Аппетит кота не может быть отрицательным!");
        else if (appetite >= 0 && satiety == true) {
            System.out.println("Кот не голоден");
        } else if (appetite == 0 && satiety == false) {
            System.out.println("Кот голоден, но есть отказался. Его аппетит " + appetite);
        } else if (p.getFood() >= appetite && satiety == false && appetite > 0) {
            int food_ = p.getFood() - appetite;
            p.setFood(food_);
            satiety = true;
            System.out.println("Кот " + getName() + " поел. Осталось " + p.getFood() + " единиц еды в тарелке. Его сытость: \"" + satiety + "\"");
        } else if (p.getFood() < appetite) {
            System.out.println("Аппетит кота " + getName() + " превышает количество еды в тарелке (количество еды в тарелке: " + p.getFood() + " единиц, аппетит: " + appetite + " единиц). Кот обиделся и отказался есть. Его сытость: \"" + satiety + "\"");
        }
    }

    public void counting() {   //Метод подсчета котов
        System.out.println("Количество котов: " + countCat);
    }
}
