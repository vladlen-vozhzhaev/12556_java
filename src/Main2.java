import java.util.Scanner;
/*
* Задание: Запросить у пользователя ввод числа и сохранить это число в переменную a.
* Если переменная a равна 10, то выведите 'Верно', иначе выведите 'Неверно'.
 * */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин:");
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String pass = scanner.nextLine();
        if(login.equals("admin") && pass.equals("123")){
            System.out.println("Доступ разрешен");
        }else{
            System.out.println("Доступ запрещен");
        }
        /*System.out.println("Введите число");
        int num = scanner.nextInt();
        if(num > 5){ // если
            System.out.println("Число больше 5");
        }else{ // иначе
            System.out.println("Число меньше 5");
        }*/
    }
}
