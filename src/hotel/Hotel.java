package hotel;

public class Hotel {
    Room[] rooms = {
            new Room(111, 4,true,false, true),
            new Room(112, 3, true, true, false),
            new Room(113, 4, true, false, false),
            new Room(211, 2, true, true, true),
            new Room(212, 1, false, false, false),
            new Room(213, 3, true, false, true),
            new Room(311, 1, true, true, true),
            new Room(312, 2, false, false, false),
            new Room(313, 2, false, true, true)
    };
    public void getFreeRooms(){
        for (Room room : rooms) {
            if(!room.isReserved()){
                System.out.print(room.getNumber()+" ");
            }
        }
        System.out.println("");
    }
    public void reservingRoom(int num){
        for (Room room : rooms) {
            if(room.getNumber() == num && !room.isReserved()){
                room.setReserved(true);
                System.out.println("Комната номер "+num+" успешно забронирована");
                return;
            }
        }
        System.out.println("Этот номер не существует или уже забронирован");
    }
}
