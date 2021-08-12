
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();


         System.out.println("num1  is: " +num1);
         System.out.println("num2 is : "  +num2);

         if(num1>num2) {

             System.out.println("The largest number is: " +num1);
         }
             else{
               System.out.println("The largest number is: " +num2);
         }


    }
}
