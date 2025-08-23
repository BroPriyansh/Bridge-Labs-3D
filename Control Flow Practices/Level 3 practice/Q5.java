import java.util.*;
public class Q5 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int original = number, sum = 0;
    while (number != 0){
      int d = number % 10;
      sum += d * d * d;
      number /= 10;
    }
    System.out.println(sum == original ? "Armstrong Number" : "Not Armstrong");
  }
}
