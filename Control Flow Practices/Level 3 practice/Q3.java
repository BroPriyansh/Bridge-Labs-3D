import java.util.*;
public class Q3 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double phy = sc.nextDouble();
    double che = sc.nextDouble();
    double mat = sc.nextDouble();
    double avg = (phy + che + mat) / 3.0;
    String grade, remark;
    if (avg >= 80){ grade = "A"; remark = "Level 4, above agency-normalized standards"; }
    else if (avg >= 70){ grade = "B"; remark = "Level 3, at agency-normalized standards"; }
    else if (avg >= 60){ grade = "C"; remark = "Level 2, below but approaching standards"; }
    else if (avg >= 50){ grade = "D"; remark = "Level 1, well below standards"; }
    else if (avg >= 40){ grade = "E"; remark = "Level 1-, too below standards"; }
    else { grade = "R"; remark = "Remedial standards"; }
    System.out.println("Average: " + avg);
    System.out.println("Grade: " + grade);
    System.out.println("Remarks: " + remark);
  }
}
