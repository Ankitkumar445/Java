/*Write a Java program that takes all the lines input to standard input and writes them to
standard output in reverse order. That is, each line is output in the correct order, but the
ordering of the lines is reversed. */
package Iter;

import java.util.*;

public class Reverseorder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of lines for input :");
        int n = in.nextInt();
        in.nextLine(); // Consume newline character left by nextInt()
        String str[] = new String[n];
        System.out.println("Enter the lines:");
        for (int i = 0; i < n; i++){
            str[i] = in.nextLine();}
        System.out.println("Reversed order:");
        for (int j = n - 1; j >= 0; j--){
            System.out.println(str[j]);}

        in.close(); // Closing the scanner
    }
}
