public class Main7 {
    public static void main(String[] args) {
        String[] cars = {"bmw", "audi"};
        try {
            System.out.println(cars[1]);
            System.out.println(cars[3]);
            System.out.println(cars[0]);
        }catch (Exception e){
            System.out.println("Упс... Не получилось выполнить все инструкции со строки 5-7");
        }
        System.out.println("Программа продожила работу...");
    }
}
