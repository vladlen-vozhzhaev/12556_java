import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", 4, "Дворняга");
        barsik.run();
        Bird kesha = new Bird("Кеша", 6, "Волнистый");
        kesha.fly();

        /*Person nina = new Person("Нина", "Иванова", 60, null, null);
        Person sergey = new Person("Сергей", "Иванов", 33, nina, null);
        Person olga = new Person("Olga", "Ivanova", 32, null, null);
        Person ivan = new Person("Ivan", "Ivanov", 12, olga, sergey);
        //System.out.println(ivan.getFather().getMother().getName());
        olga.info();*/
    }
}