import java.util.*;
public class Q7 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int month = sc.nextInt(); // 1..12
    int day = sc.nextInt();   // 1..31
    boolean spring =
        (month == 3 && day >= 20 && day <= 31) ||
        (month == 4 && day >= 1 && day <= 30) ||
        (month == 5 && day >= 1 && day <= 31) ||
        (month == 6 && day >= 1 && day <= 20);
    System.out.println(spring ? "Its a Spring Season" : "Not a Spring Season");
  }
}
