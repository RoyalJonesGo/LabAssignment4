public class FrontDesk {

    public void requestValet(String plateNumber) {
        Valet valetService = new Valet(plateNumber);
        valetService.execute();
    }

    public void requestHouseKeeping(int roomNumber) {
        HouseKeeping houseKeepingService = new HouseKeeping(roomNumber);
        houseKeepingService.execute();
    }

    public void requestCart(int numberOfCarts) {
        Cart cartService = new Cart(numberOfCarts);
        cartService.execute();
    }
}
