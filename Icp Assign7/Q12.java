/*The selection-sort method repeatedly finds the smallest number in the current array and swaps it
with the first. Write a java program that reads in ten integer values, invoke the method, and
displays the sorted elements.*/

package Threaddemo1;
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        System.out.print("Sorted array: " );
        for (int j : arr) {
            System.out.print(j + " ");
        }
        sc.close();
    }
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
