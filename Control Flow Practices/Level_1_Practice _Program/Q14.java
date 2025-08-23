import java.util.*;
public class Q14 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n >= 0){
      long fact = 1;
      int i = 2;
      while (i <= n){ fact *= i; i++; }
      System.out.println(fact);
    } else {
      System.out.println("Enter a non-negative integer");
    }
  }
}
