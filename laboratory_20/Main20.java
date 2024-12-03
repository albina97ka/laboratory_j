public class Main20 {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();
        Transport truck = transportFactory.createTruck();
        truck.deliver();
        Transport ship = transportFactory.createShip();
        ship.deliver();
        Transport airplane = transportFactory.createAirplane();
        airplane.deliver();
    }
}
