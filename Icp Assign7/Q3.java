/*Input 10 integers from the keyboard into an array. The number to be searched is entered through
the keyboard by the user. Write a java program to find if the number to be searched is present in
the array and if it is present, display the number of times it appears in the array. */

package Threaddemo1;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number to be searched: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i : arr) {
            if (i == n) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println(n + " is present " + count + " time" + ((count > 1) ? "s" : "") + " in the array");
        } else {
            System.out.println(n + " is not present in the array");
        }
        sc.close();
    }
}
