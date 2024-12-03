import java.util.Arrays;
import java.util.Scanner;
import java.util.function.*;

public class ArraySorter {
    public static void sortArray(int[] arr, BooleanSupplier isAscending) {
        if (isAscending.getAsBoolean()) {
            Arrays.sort(arr);
        } else {
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j + 1] < arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("������� ����� �������: ");
        int length = scanner.nextInt();

        int[] arrAsc = new int[length];
        int[] arrDesc = new int[length];

        System.out.println("������� �������� �������:");
        for (int i = 0; i < length; i++) {
            arrAsc[i] = scanner.nextInt();
        }

        System.out.println("������� �������� ������:");
        for (int i = 0; i < length; i++) {
            arrDesc[i] = scanner.nextInt();
        }

        System.out.println("������ ����� �����������: " + Arrays.toString(arrAsc));
        sortArray(arrAsc, () -> true);
        System.out.println("������ ����� ���������� �� �����������: " + Arrays.toString(arrAsc));

        System.out.println("������ ����� �����������: " + Arrays.toString(arrDesc));
        sortArray(arrDesc, () -> false);
        System.out.println("������ ����� ���������� �� ��������: " + Arrays.toString(arrDesc));

        scanner.close();
    }
}