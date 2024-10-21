public class HouseKeeping implements HotelService {

    private int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void cleanRoom() {
        System.out.println("Cleaning room number: " + roomNumber);
    }

    @Override
    public void execute() {
        cleanRoom();
    }
}
