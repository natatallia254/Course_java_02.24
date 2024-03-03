package school.lesson5;

public class Dog extends Animal {
    static int countDog;

    public Dog(String name, int distRun, int distSwim) {
        super(name, distRun, distSwim);
        countDog++;
    }

    public void run() {   //Метод бега собак
        if (getDistRun() > 0 && getDistRun() <= 500)
            System.out.println("Собака " + getName() + " пробежала " + getDistRun() + " метр.");
        else if (getDistRun() <= 0)
            System.out.println("Собака " + getName() + " не пробежала ни одного метра");
        else
            System.out.println("Собака " + getName() + " физически не могла пробежать " + getDistRun() + " метр.");
    }

    public void swim() {   //Метод плавания собак
        if (getDistSwim() > 0 && getDistSwim() <= 10)
            System.out.println("Собака " + getName() + " проплыла " + getDistSwim() + " метр.");
        else if (getDistSwim() <= 0)
            System.out.println("Собака " + getName() + " не проплыла ни одного метра");
        else
            System.out.println("Собака " + getName() + " физически не могла проплыть " + getDistSwim() + " метр.");
    }

    public void counting() {   //Метод подсчета собак
        System.out.println("Количество собак: " + countDog);
    }

}
