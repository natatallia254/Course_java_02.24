package school.lesson5;

public class Animal {
    private String name;
    private String color;
    static int count;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        count++;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void run(int distRun) {   //Метод бега животных
        System.out.println("Животное пробежало " + distRun + " метров");
    }

    public void swim(int distSwim) {   //Метод плавания животных
        System.out.println("Животное проплыло " + distSwim + " метров");
    }

    public void counting() {   //Метод подсчета животных
        System.out.println("Количество животных: " + count);
    }
}
