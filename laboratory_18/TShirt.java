class TShirt extends Clothing implements MensClothing, WomensClothing {
    public TShirt(ClothingSize size, double cost, String color) {

        super(size, cost, color);
    }
    @Override
    public void dressMen() {
        System.out.println("������� ��������");
    }

    @Override
    public void dressWomen() {
        System.out.println("������� ��������");
    }
}