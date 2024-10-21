public class HotelApp {

    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        // Request valet service
        frontDesk.requestValet("ABC-123");

        // Request room cleaning service
        frontDesk.requestHouseKeeping(101);

        // Request cart service
        frontDesk.requestCart(3);
    }
}
