import java.util.*;
public class Q8 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = Math.abs(n), sum = 0;
    if (t == 0){ System.out.println("Harshad Number"); return; } // 0 divisible by any? define as Harshad
    while (t != 0){ sum += t % 10; t /= 10; }
    System.out.println(sum != 0 && n % sum == 0 ? "Harshad Number" : "Not a Harshad Number");
  }
}
