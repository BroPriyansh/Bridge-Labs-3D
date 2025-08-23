import java.util.*;
public class Q13 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n >= 1){
      int sumFor = 0;
      for (int i = 1; i <= n; i++) sumFor += i;
      int sumFormula = n * (n + 1) / 2;
      System.out.println("For sum = " + sumFor);
      System.out.println("Formula sum = " + sumFormula);
      System.out.println("Match? " + (sumFor == sumFormula));
    } else {
      System.out.println("Not a Natural Number");
    }
  }
}
