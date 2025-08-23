import java.util.*;
public class Q6 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    n = Math.abs(n);
    if (n == 0){ System.out.println(1); return; }
    int count = 0;
    while (n != 0){ n /= 10; count++; }
    System.out.println(count);
  }
}
