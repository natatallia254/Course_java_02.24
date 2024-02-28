package school.lesson5;

public class Cat extends Animal {
    private boolean satiety;
    private int appetite;
    static int countCat;

    public Cat(String name, String color, boolean satiety, int appetite) { //Кличка кота, его цвет, сытость и аппетит
        super(name, color);
        this.satiety = satiety;
        this.appetite = appetite;
        countCat++;
    }

    public void infoCat() {   //Информация о коте
        System.out.println("Кот " + getName() + " цвета \"" + getColor() + "\" с сытостью \"" + satiety + "\" и аппетитом \"" + appetite + "\"");
    }

    public void run(int distRun) {   //Метод бега котов
        if (distRun > 0 && distRun <= 200)
            System.out.println("Кот " + getName() + " цвета \"" + getColor() + "\" пробежал " + distRun + " метр.");
        else if (distRun <= 0)
            System.out.println("Кот " + getName() + " цвета \"" + getColor() + "\" не пробежал ни одного метра");
        else
            System.out.println("Кот " + getName() + " цвета \"" + getColor() + "\" физически не мог пробежать " + distRun + " метр.");
    }

    //Кот не умеет плавать, поэтому не будем переопределять метод distSwim

    public void eatCat(Plate p) {
        p.reducingFood(getColor(), getName(), appetite, satiety);
    }

    public void counting() {   //Метод подсчета котов
        System.out.println("Количество котов: " + countCat);
    }
}
