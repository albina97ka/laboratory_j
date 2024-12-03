public class TransportFactory {
    Transport createShip(){
        return new Ship();
    }
    Transport createTruck(){
        return new Truck();
    }
    Transport createAirplane(){
        return new Airplane();
    }
}

