/*Write a recursive method in Java which, given an integer n, print it with its digits reversed.*/
package Threaddemo1;

import java.util.Scanner;

public class Q8 {
    static int a=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse :");
        int n = sc.nextInt();
        System.out.print("The reverse number is:");
        reverseNumber(n);
        sc.close();
    }
    public static void reverseNumber(int num){
        if(num<10){
            System.out.print(num);
            return;
        }else {
            System.out.print(num%10);
            reverseNumber(num/10);
        }
    }
}
