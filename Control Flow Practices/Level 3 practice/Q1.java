import java.util.*;
public class Q1 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int y = sc.nextInt();
    if (y >= 1582){
      boolean leap = (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
      System.out.println(leap ? "Leap Year" : "Not a Leap Year");
    } else {
      System.out.println("Year must be >= 1582");
    }
  }
}
