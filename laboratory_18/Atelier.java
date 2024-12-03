public class Atelier {
    public void dressWomen(Clothing[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothing clothing : clothes) {
            System.out.println("Размер: " + clothing.getSize() + ", Цена: " + clothing.getCost() + ", Цвет: " + clothing.getColor());
            ((WomensClothing) clothing).dressWomen();
        }
    }

    public void dressMen(Clothing[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothing clothing : clothes) {
            System.out.println("Размер: " + clothing.getSize() + ", Цена: " + clothing.getCost() + ", Цвет: " + clothing.getColor());
            ((MensClothing) clothing).dressMen();
        }
    }
}