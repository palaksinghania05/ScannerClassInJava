/* An application to demonstrate use of Scanner class.
Create an application to accept firstname,
rollNumber,percentage,section,year,
course from user. And display the output in below format.
Output
First Name : Palak
Roll Number : 19
Percentage : 96.4
Section : R
Year : 2
Course : B.Tech CSE
 */

import java.util.Scanner;
public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        System.out.println("Enter your first name");
        String name=object.next();
        System.out.println("Enter your roll number");
        int roll=object.nextInt();
        System.out.println("Enter your percentage");
        double percent=object.nextDouble();
        System.out.println("Enter your section");
        String section=object.next();
        System.out.println("Enter your year");
        byte year=object.nextByte();
        System.out.println("Enter your course");
        String course=object.nextLine();
        object.close();
        //Output
        System.out.println("First Name : "+name);
        System.out.println("Roll Number : "+roll);
        System.out.println("Percentage : "+percent);
        System.out.println("Section : "+section);
        System.out.println("Year : "+year);
        System.out.println("Course : "+course);
    }
}
