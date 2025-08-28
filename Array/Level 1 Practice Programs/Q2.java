import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int n : arr) {
            if (n > 0) {
                System.out.println(n + (n % 2 == 0 ? " is Positive and Even" : " is Positive and Odd"));
            } else if (n < 0) {
                System.out.println(n + " is Negative");
            } else {
                System.out.println(n + " is Zero");
            }
        }
        if (arr[0] == arr[4]) {
            System.out.println("First and last element are Equal");
        } else if (arr[0] > arr[4]) {
            System.out.println("First element is Greater than last element");
        } else {
            System.out.println("First element is Less than last element");
        }
        sc.close();
    }
}
