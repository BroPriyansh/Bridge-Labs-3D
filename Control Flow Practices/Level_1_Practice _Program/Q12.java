import java.util.*;
public class Q12 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n >= 1){
      int sumWhile = 0, i = 1;
      while (i <= n){ sumWhile += i; i++; }
      int sumFormula = n * (n + 1) / 2;
      System.out.println("While sum = " + sumWhile);
      System.out.println("Formula sum = " + sumFormula);
      System.out.println("Match? " + (sumWhile == sumFormula));
    } else {
      System.out.println("Not a Natural Number");
    }
  }
}
