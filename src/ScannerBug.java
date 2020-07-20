
//to demonstrate problem of reading String after numeric value
import java.util.Scanner;
public class ScannerBug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your roll number");
        int roll=sc.nextInt();
        //we have to write a blank nextline so that it moves the cursor away from \n
        sc.nextLine();
        //other method can be we can change nextLine to next but it will read only first string
        System.out.println("Enter your full name");
        String name=sc.nextLine();
        System.out.println("Enter Section");
        String section=sc.next();
        sc.close();
        System.out.println("Output Starts");
        System.out.println(roll + "\n" + name + "\n" + section);
    }
}
