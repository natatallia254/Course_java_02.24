package school.lesson4;

public class MainPark {
    public static void main(String[] args) {
        Park park1 = new Park("Парк имени Челюскинцев", "09:00-24:00", 3);
        Park.Attraction park1Attr1 = park1.new Attraction("Супер-8", "10:00-21:00", 25);
        park1.addArrayAttr(park1Attr1);
        Park.Attraction park1Attr2 = park1.new Attraction("Веселые горки", "10:00-21:00", 14);
        park1.addArrayAttr(park1Attr2);
        Park.Attraction park1Attr3 = park1.new Attraction("Комната смеха", "11:00-20:30", 7);
        park1.addArrayAttr(park1Attr3);

        Park park2 = new Park("Парк имени Луначарского", "10:00-23:00", 4);
        Park.Attraction park2Attr1 = park2.new Attraction("Ромашка", "10:00-19:00", 5);
        park2.addArrayAttr(park2Attr1);
        Park.Attraction park2Attr2 = park2.new Attraction("Колесо обозрения", "10:00-20:00", 15);
        park2.addArrayAttr(park2Attr2);
        Park.Attraction park2Attr3 = park1.new Attraction("Комната страха", "11:00-18:30", 5);
        park2.addArrayAttr(park2Attr3);
        Park.Attraction park2Attr4 = park1.new Attraction("Комната релакса", "11:00-20:30", 40);
        park2.addArrayAttr(park2Attr4);

        park1.printArrayAttr();
        System.out.println();
        park2.printArrayAttr();
        System.out.println();

        System.out.println("Время работы парка \"" + park1.getNamePark() + "\": " + park1.getWorkTimePark());
        System.out.println("Время работы парка \"" + park2.getNamePark() + "\": " + park2.getWorkTimePark());
        park1Attr2.printAttr();
        park2Attr2.printAttr();
        System.out.println();
        park2.setWorkTimePark("10:00-24:00");
        System.out.println("Новое время работы парка \"" + park2.getNamePark() + "\": " + park2.getWorkTimePark());
        park2Attr1.setWorkTimeAttr("10:00-20:00");
        System.out.println("Новое время работы аттракциона \"" + park2Attr1.getNameAttr() + "\" в парке \"" + park2.getNamePark() + "\": " + park2Attr1.getWorkTimeAttr());
        park1Attr3.setPriceAttr(8);
        System.out.println("Новая стоимость аттракциона \"" + park1Attr3.getNameAttr() + "\" в парке \"" + park1.getNamePark() + "\": " + park1Attr3.getPriceAttr());
        System.out.println();

        park2Attr1.printAttr();
        park1Attr3.printAttr();
        System.out.println();

        park1.printArrayAttr();
        System.out.println();
        park2.printArrayAttr();
        System.out.println();
    }
}
