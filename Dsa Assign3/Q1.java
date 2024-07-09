/*Write a Java program to read your lucky number from keyboard. Treat –ve no. as
NumberFormatException. Write appropriate Exceptional handler */
package Assing3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter you lucky number :");
        int i=sc.nextInt();
        if(i<0){
            throw new NumberFormatException("negetive number not allowed");
        } else {
            System.out.println("the lucky number is allowed"+i);
        }
    }
}
