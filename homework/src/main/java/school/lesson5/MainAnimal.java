package school.lesson5;

public class MainAnimal {
    public static void main(String[] args) {
        /*Animal animal = new Animal("Дружок", 300, 200);
        animal.run();
        animal.swim();
        animal.counting();
        System.out.println();*/

        Plate plate = new Plate();
        System.out.println("Количество еды в тарелке: " + plate.getFood());   //информация о количестве еды в тарелке после ее создания (она пуста)
        plate.addFood(120);   //добавляем еду в тарелку
        plate.addFood(250);   //а добавим-ка еще еды в тарелку
        System.out.println();

        Cat cat = new Cat("Барсик", 400, 500, false, 20);   //пример одного кота
        cat.run();   //кот бежит
        cat.swim();   //кот плывет (не умеет)
        cat.eatCat(plate);   //передаем коту тарелку с едой
        cat.counting();   //подсчитываем (пока должен быть единственный кот)
        System.out.println();

        Cat[] catArray = new Cat[7];   //массив котов
        catArray[0] = new Cat("Марсик", 100, 10, false, 100);
        catArray[1] = new Cat("Красавчик", 200, 20, false, 0);
        catArray[2] = new Cat("Кляксик", 300, 30, true, 70);
        catArray[3] = new Cat("Фрося", 400, 40, false, 1000);
        catArray[4] = new Cat("Васька", 500, 50, false, 100);
        catArray[5] = new Cat("Белочка", 600, 60, false, 55);
        catArray[6] = new Cat("Алиса", 0, 70, false, 120);

        for (int i = 0; i < catArray.length; i++) {
            catArray[i].run();   //кот бежит
            catArray[i].swim();   //кот плывет (не умеет)
            plate.getFood();   //получение количества еды из тарелки
            catArray[i].eatCat(plate);   //передаем каждому коту из массива тарелку
            System.out.println();
        }
        cat.counting();   //подсчитываем количество всех созданных котов (в массиве и не в массиве)
        System.out.println();

        Dog dog = new Dog("Бобик", 501, 9);   //пример одной собаки
        dog.run();   //собака бежит
        dog.swim();   //собака плывет
        dog.counting();   //подсчитываем собак (пока создали единственную собаку)
        System.out.println();
    }
}
