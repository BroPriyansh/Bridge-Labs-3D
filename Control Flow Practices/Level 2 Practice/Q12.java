import java.util.*;
public class Q12 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int power = sc.nextInt();
    if (power < 0){ System.out.println("Power must be non-negative"); return; }
    long result = 1;
    for (int i = 1; i <= power; i++) result *= number;
    System.out.println(result);
  }
}
