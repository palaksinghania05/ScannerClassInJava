//to demonstrate the process of taking input in hackerrank questions
import java.util.Scanner;

public class ScannerHackerrank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll no.,name and section and separate them by space");
        int roll=sc.nextInt();
        String name=sc.next();
        String section=sc.next();
        System.out.println(roll + "," + name + "," +section);
    }
}
