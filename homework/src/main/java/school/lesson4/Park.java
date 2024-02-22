package school.lesson4;

import java.util.Arrays;

public class Park {
    private String namePark;  //Название парка
    private String workTimePark;   //Время работы парка

    private Attraction[] arrayAttr; //Массив аттракционов конкретного парка
    private int i = 0;

    public Park(String namePark, String workTimePark, int count) {
        this.namePark = namePark;
        this.workTimePark = workTimePark;
        arrayAttr = new Attraction[count];
    }

    public String getNamePark() {
        return namePark;
    }

    public String getWorkTimePark() {
        return workTimePark;
    }

    public void setWorkTimePark(String workTimePark) {
        this.workTimePark = workTimePark;
    }

    @Override
    public String toString() {
        return "Park{" +
                "namePark='" + namePark + '\'' +
                ", workTimePark='" + workTimePark + '\'' +
                ", arrayAttr=" + Arrays.toString(arrayAttr) +
                ", i=" + i +
                '}';
    }

    public void addArrayAttr(Attraction attraction) {
        if (i < arrayAttr.length) {
            arrayAttr[i] = attraction;
            i++;
        } else
            System.out.println("В парке не может быть большее количество аттракционов!");
    }

    public void printArrayAttr() {
        System.out.println("Массив аттракционов парка \"" + namePark + "\":");
        for (Attraction attraction : arrayAttr) {
            if (attraction != null)
                System.out.println(attraction);
        }
    }

    public class Attraction {
        private String nameAttr;   //Название аттракциона
        private String workTimeAttr;   //Время работы аттракциона
        private double priceAttr;   //Стоимость аттракциона

        public Attraction(String nameAttr, String workTimeAttr, double priceAttr) {
            this.nameAttr = nameAttr;
            this.workTimeAttr = workTimeAttr;
            this.priceAttr = priceAttr;
        }

        public String getNameAttr() {
            return nameAttr;
        }

        public String getWorkTimeAttr() {
            return workTimeAttr;
        }

        public void setWorkTimeAttr(String workTimeAttr) {
            this.workTimeAttr = workTimeAttr;
        }

        public double getPriceAttr() {
            return priceAttr;
        }

        public void setPriceAttr(double priceAttr) {
            this.priceAttr = priceAttr;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "nameAttr='" + nameAttr + '\'' +
                    ", workTimeAttr='" + workTimeAttr + '\'' +
                    ", priceAttr=" + priceAttr +
                    '}';
        }

        public void printAttr() {
            System.out.println("Наш парк \"" + namePark + "\" приглашает гостей и жителей города. Время работы парка: " + workTimePark + ". Название аттракциона: \"" + nameAttr + "\". Время работы аттракциона: " + workTimeAttr + ". Стоимость аттракциона " + "\"" + nameAttr + "\": " + priceAttr + " руб.");
        }
    }
}
