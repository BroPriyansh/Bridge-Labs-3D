import java.util.*;
public class Q10 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double first = sc.nextDouble();
    double second = sc.nextDouble();
    String op = sc.next().trim();
    switch (op){
      case "+": System.out.println(first + second); break;
      case "-": System.out.println(first - second); break;
      case "*": System.out.println(first * second); break;
      case "/":
        if (second == 0) System.out.println("Division by zero");
        else System.out.println(first / second);
        break;
      default: System.out.println("Invalid Operator");
    }
  }
}
