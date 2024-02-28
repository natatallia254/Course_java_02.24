package school.lesson5;

public class Dog extends Animal {
    static int countDog;

    public Dog(String name, String color) {   //Кличка собаки, ее цвет
        super(name, color);
        countDog++;
    }

    public void run(int distRun) {   //Метод бега собак
        if (distRun > 0 && distRun <= 500)
            System.out.println("Собака " + getName() + " цвета \"" + getColor() + "\" пробежала " + distRun + " метр.");
        else if (distRun <= 0)
            System.out.println("Собака " + getName() + " цвета \"" + getColor() + "\" не пробежала ни одного метра");
        else
            System.out.println("Собака " + getName() + " цвета \"" + getColor() + "\" физически не могла пробежать " + distRun + " метр.");
    }

    public void swim(int distSwim) {   //Метод плавания собак
        if (distSwim > 0 && distSwim <= 10)
            System.out.println("Собака " + getName() + " цвета \"" + getColor() + "\" проплыла " + distSwim + " метр.");
        else if (distSwim <= 0)
            System.out.println("Собака " + getName() + " цвета \"" + getColor() + "\" не проплыла ни одного метра");
        else
            System.out.println("Собака " + getName() + " цвета \"" + getColor() + "\" физически не могла проплыть " + distSwim + " метр.");
    }

    public void counting() {   //Метод подсчета собак
        System.out.println("Количество собак: " + countDog);
    }

}
