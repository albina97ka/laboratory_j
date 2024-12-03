public class Atelier {
    public void dressWomen(Clothing[] clothes) {
        System.out.println("������� ������:");
        for (Clothing clothing : clothes) {
            System.out.println("������: " + clothing.getSize() + ", ����: " + clothing.getCost() + ", ����: " + clothing.getColor());
            ((WomensClothing) clothing).dressWomen();
        }
    }

    public void dressMen(Clothing[] clothes) {
        System.out.println("������� ������:");
        for (Clothing clothing : clothes) {
            System.out.println("������: " + clothing.getSize() + ", ����: " + clothing.getCost() + ", ����: " + clothing.getColor());
            ((MensClothing) clothing).dressMen();
        }
    }
}