import java.util.*;
public class Q14 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int power = sc.nextInt();
    if (power < 0){ System.out.println("Power must be non-negative"); return; }
    long result = 1;
    int counter = 0;
    while (counter < power){
      result *= number;
      counter++;
    }
    System.out.println(result);
  }
}
