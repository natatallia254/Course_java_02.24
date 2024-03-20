package school.lesson10;

public class Main {
    public static void main(String[] args) {
        Box<Apple> boxForApple = new Box<>();
        Box<Orange> boxForOrange = new Box<>();
        Box<Orange> boxForOrangeTwo = new Box<>();

        System.out.println("Вес пустой коробки для яблок: " + boxForApple.getWeight());
        System.out.println("Вес первой пустой коробки для апельсин: " + boxForOrange.getWeight());
        System.out.println("Вес второй пустой коробки для апельсин: " + boxForOrangeTwo.getWeight());
        System.out.println();

        boxForApple.addFruitBox(new Apple());
        boxForApple.addFruitBox(new Apple());
        boxForApple.addFruitBox(new Apple());
        boxForOrange.addFruitBox(new Orange());
        boxForOrange.addFruitBox(new Orange());
        boxForOrangeTwo.addFruitBox(new Orange());
        boxForOrangeTwo.addFruitBox(new Orange());
        boxForOrangeTwo.addFruitBox(new Orange());
        boxForOrangeTwo.addFruitBox(new Orange());

        System.out.println("Общий вес коробки с яблоками: " + boxForApple.getWeight());
        System.out.println("Общий вес первой коробки с апельсинами: " + boxForOrange.getWeight());
        System.out.println("Общий вес второй коробки с апельсинами: " + boxForOrangeTwo.getWeight());
        System.out.println();

        System.out.println("Равны ли разные коробки с апельсинами по весу: " + boxForOrange.compare(boxForOrangeTwo));
        System.out.println("Равны ли коробка с яблоками и первая коробка с апельсинами по весу: " + boxForApple.compare(boxForOrange));
        System.out.println();

        boxForOrange.transfer(boxForOrangeTwo);
        System.out.println("Общий вес первой коробки с апельсинами после пересыпания: " + boxForOrange.getWeight());
        System.out.println("Общий вес второй коробки с апельсинами после пересыпания: " + boxForOrangeTwo.getWeight());
        System.out.println("Равны ли разные коробки с апельсинами по весу после пересыпания: " + boxForOrange.compare(boxForOrangeTwo));

    }
}
