package hotel;

import java.util.Scanner;

/*
* Разработать консольное приложения для менеджера гостиницы
* Менеджер должен иметь возможность
* 1) Видеть список свободных номеров ( /getFreeRooms )
* 2) Забронированных номеров
* 3) Бронировать номера
* 4) Фильтровать номера по характеристикам
* 5) Освободить номер
* */
public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите команду:");
            String command = scanner.nextLine();
            if(command.equals("/getFreeRooms")){
                hotel.getFreeRooms();
            }else if(command.equals("/reserve")){
                System.out.println("Введите номер комнаты для бронирования:");
                int num = Integer.parseInt(scanner.nextLine());
                hotel.reservingRoom(num);
            }else if(command.equals("/exit")){
                break;
            }
        }
    }
}
