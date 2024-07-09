/*Write a java program that implements the array reversal algorithm suggested in Note 1.
Note 1: There is a simpler algorithm for array reversal that starts
out with two indices, i=0 and j=n-1. With each iteration i is
increased and j is decreased for i<j.
*/
package Threaddemo1;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original array: ");
        printArray(arr);
        reverseArray(arr);
        System.out.print("Reversed array: ");
        printArray(arr);
        sc.close();
    }
    private static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
    private static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
