public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Судно доставляет груз по морю");
    }
}
