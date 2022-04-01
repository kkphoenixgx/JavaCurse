package Class;
import Class.NumberToStringUtil;

public class Quartos {
    
    int roomNumber;

    public Quartos(int roomNumber, String name, String email){
        this.roomNumber = roomNumber;

    }

    public void rent(int roomNumber, String name, String email){

        String rooms[] = new String[10];

        System.out.println(rooms[roomNumber]);
        if(rooms[roomNumber] != null) return;

        String user[] = new String[3];
        String stringRoomNumber = NumberToStringUtil.toString(roomNumber);
        
        rooms[roomNumber] = user[];

    }

}
