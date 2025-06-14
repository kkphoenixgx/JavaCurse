package Class;
// import Class.NumberToStringUtil;

public class Quartos {
    
    int roomNumber;

    public Quartos(int roomNumber, String name, String email){
        this.roomNumber = roomNumber;

    }

    public void rent(int roomNumber, String name, String email){

        String rooms[] = new String[10];

        if(rooms[roomNumber] != null) {
            System.out.println("The room is full");
            System.exit(0);
        };

        // !TODO: Not Finished
        // String user[] = new String[3];
        // String stringRoomNumber = NumberToStringUtil.toString(roomNumber);
        
        // rooms[roomNumber] = user;

    }

}
