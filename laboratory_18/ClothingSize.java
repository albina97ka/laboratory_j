enum ClothingSize {
    XS(34),
    S(36),
    M(38),
    L(40);

    private int euroSize;

    ClothingSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return "�������� ������";
    }

    public int getEuroSize() {
        return euroSize;
    }
}