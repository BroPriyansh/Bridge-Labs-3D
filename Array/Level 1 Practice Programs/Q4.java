import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            double num = sc.nextDouble();
            if (num <= 0 || index == 10) break;
            arr[index++] = num;
        }
        for (int i = 0; i < index; i++) {
            total += arr[i];
        }
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + (i + 1 < index ? " " : ""));
        }
        if (index > 0) System.out.println();
        System.out.println("Sum of numbers = " + total);
        sc.close();
    }
}
