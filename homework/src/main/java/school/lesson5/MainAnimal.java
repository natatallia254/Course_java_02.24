package school.lesson5;

public class MainAnimal {
    public static void main(String[] args) {
        /*Animal animal = new Animal("Дружок", "рыжий");
        animal.run(300);
        animal.counting();
        System.out.println();*/

        Plate plate = new Plate();
        System.out.println("Количество еды в тарелке: " + plate.getFood());   //информация о количестве еды в тарелке после ее создания (она пуста)
        plate.addFood(120);   //добавляем еду в тарелку
        plate.addFood(250);   //а добавим-ка еще еды в тарелку
        System.out.println();

        Cat cat = new Cat("Барсик", "белый", false, 500);   //пример одного кота
        cat.run(400);   //передаем методу бега кота необходимую дистанцию
        cat.infoCat();   //информация о коте (его имя, цвет, состояние сытости и аппетит)
        cat.eatCat(plate);   //передаем коту тарелку с едой (если у кота первоначально нет аппетита (аппетит true), то есть ему не предлагаем)
        cat.counting();   //подсчитываем (пока должен быть единственный кот)
        System.out.println();

        Cat[] catArray = new Cat[7];   //массив котов
        catArray[0] = new Cat("Марсик", "белый", true, 200);
        catArray[1] = new Cat("Барсик", "рыжий", false, 100);
        catArray[2] = new Cat("Кляксик", "черно-белый", false, 150);
        catArray[3] = new Cat("Фрося", "черно-белый", false, 1000);
        catArray[4] = new Cat("Васька", "черный", false, 20);
        catArray[5] = new Cat("Белочка", "рыжий", true, 70);
        catArray[6] = new Cat("Алиса", "рыже-коричневый", false, 120);

        for (int i = 0; i < catArray.length; i++) {
            plate.getFood();   //получение количества еды из тарелки
            catArray[i].infoCat();   //информация о каждом коте массива котов (его имя, цвет, состояние сытости и аппетит)
            catArray[i].eatCat(plate);   //передаем каждому коту из массива тарелку (если у кота первоначально нет аппетита (аппетит true), то есть ему не предлагаем)
            System.out.println();
        }
        cat.counting();   //подсчитываем количество всех созданных котов (в массиве и не в массиве)
        System.out.println();

        Dog dog = new Dog("Бобик", "черный");   //пример одной собаки
        dog.run(700);   //передаем методу бега собаки необходимую дистанцию
        dog.swim(9);   //передаем методу плавания собаки необходимую дистанцию
        dog.counting();   //подсчитываем собак (пока создали единственную собаку)
        System.out.println();
    }
}
