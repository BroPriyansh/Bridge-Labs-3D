import java.util.*;
public class Q6 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int ageA = sc.nextInt(), hA = sc.nextInt();     // Amar: age, height
    int ageB = sc.nextInt(), hB = sc.nextInt();     // Akbar
    int ageC = sc.nextInt(), hC = sc.nextInt();     // Anthony
    // Youngest
    String youngest = "Amar"; int minAge = ageA;
    if (ageB < minAge){ minAge = ageB; youngest = "Akbar"; }
    if (ageC < minAge){ minAge = ageC; youngest = "Anthony"; }
    // Tallest
    String tallest = "Amar"; int maxH = hA;
    if (hB > maxH){ maxH = hB; tallest = "Akbar"; }
    if (hC > maxH){ maxH = hC; tallest = "Anthony"; }
    System.out.println("Youngest: " + youngest + " (" + minAge + ")");
    System.out.println("Tallest: " + tallest + " (" + maxH + ")");
  }
}
