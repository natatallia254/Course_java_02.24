package school.lesson5;

public class Animal {
    private String name;
    int distRun;
    int distSwim;
    static int count;

    public Animal(String name, int distRun, int distSwim) {
        this.name = name;
        this.distRun = distRun;
        this.distSwim = distSwim;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getDistRun() {
        return distRun;
    }

    public int getDistSwim() {
        return distSwim;
    }

    public void run() {   //Метод бега животных
        if (distRun > 0)
            System.out.println("Животное пробежало " + distRun + " метров");
        else
            System.out.println("Животное не пробежало ни одного метра");
    }

    public void swim() {   //Метод плавания животных
        if (distSwim > 0)
            System.out.println("Животное проплыло " + distSwim + " метров");
        else
            System.out.println("Животное не проплыло ни одного метра");
    }

    public void counting() {   //Метод подсчета животных
        System.out.println("Количество животных: " + count);
    }
}
