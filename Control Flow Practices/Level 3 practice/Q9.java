import java.util.*;
public class Q9 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if (number <= 0){ System.out.println("Enter positive integer"); return; }
    int sum = 1; // 1 is always a proper divisor for n>1
    for (int i = 2; i * i <= number; i++){
      if (number % i == 0){
        sum += i;
        int j = number / i;
        if (j != i) sum += j;
      }
    }
    if (number == 1) sum = 0;
    System.out.println(sum > number ? "Abundant Number" : "Not an Abundant Number");
  }
}
