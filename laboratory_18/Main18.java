public class Main18 {
    public static void main(String[] args) {
        Clothing[] clothes = new Clothing[3];
        clothes[0] = new TShirt(ClothingSize.S, 1356, "Синий");
        clothes[1] = new Pants(ClothingSize.XS, 2342, "Красный");
        clothes[2] = new Skirt(ClothingSize.M, 345, "Зеленый");

        Clothing[] clothes2 = new Clothing[3];
        clothes2[0] = new TShirt(ClothingSize.M, 3785, "Черный");
        clothes2[1] = new Pants(ClothingSize.L, 273, "Фиолетовая");
        clothes2[2] = new Tie(ClothingSize.XS, 3472, "Желтый");

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        System.out.println();
        atelier.dressMen(clothes2);
    }
}
