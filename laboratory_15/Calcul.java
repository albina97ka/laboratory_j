import java.io.Serializable;

public class Calcul implements Serializable {
    private final int x;
    private double y;

    public Calcul(int x) {

        this.x = x;
    }

    public void fun() {

        y = x - Math.sin(x);
    }

    public int getX() {

        return x;
    }

    public double getY() {
        return y;
    }
}