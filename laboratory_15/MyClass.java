import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Calcul calculator = new Calcul(150 );
        calculator.fun();
        System.out.printf("%f %d\n", calculator.getY(), calculator.getX());
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("Введите save, upload или exit: ");
            String cmd = in.nextLine();
            switch (cmd) {
                case "save":
                    try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                            new FileOutputStream("calc.out"))) {
                        objectOutputStream.writeObject(calculator);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "upload":
                    try (ObjectInputStream objectInputStream = new ObjectInputStream(
                            new FileInputStream("calc.out"))) {
                        Calcul calc = (Calcul) objectInputStream.readObject();
                        System.out.printf("%f %d\n", calc.getY(), calc.getX());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Напишите другую команду");
                    break;
            }
        }
    }
}