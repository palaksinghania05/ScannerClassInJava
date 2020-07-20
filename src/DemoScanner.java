/*
Application to demonstrate use of Scanner Class
Create an Application to accept name,age,
4-digit code, cpi, mobile no, passed and display these values
to user in the given format
Name : Vaibhav Diwan
Age : 36
4-digit Code : 1122
cpi : 6.6
Mobile No : 9754435581
Passed : false
 */

import java.util.Scanner;
public class DemoScanner {
    public static void main(String[] args){
        Scanner object=new Scanner(System.in);
        System.out.println("Enter your full name");
        //declaring a String object to store name of user
        String name=object.nextLine();
        //name is a reference type of variable
        System.out.println("Enter your Age");
        //byte can store values ranging from -128 to 0 to 127
        byte age=object.nextByte();
        System.out.println("Enter 4-digit Secret Code");
        short code=object.nextShort();
        System.out.println("Enter your CPI");
        //by default floating type of value is stored in double in java
        //for float we have to write float f=3.14f
        double cpi=object.nextDouble();
        System.out.println("Enter your Mobile Number");
        long mobileNumber=object.nextLong();
        System.out.println("Enter your exam status as true for pass or false for fail");
        boolean passed=object.nextBoolean();
        object.close();
        //output
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("4-digit secret code : " + code);
        System.out.println("CPI : " + cpi);
        System.out.println("Mobile no : " + mobileNumber);
        System.out.println("Passed : " + passed);
    }
}
