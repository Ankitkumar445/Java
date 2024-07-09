/*Write a method that returns a new array by eliminating the duplicate values in the array using
the following method header:
public static int[] eliminateDuplicates(int[] list)
Write a java program that reads in ten integers, invokes the method, and displays the result*/
package Threaddemo1;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] distinct = eliminateDuplicates(arr);
        System.out.print("The distinct numbers are: ");
        for (int n : distinct) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (list[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[count++] = list[i];
            }
        }
        int newArr[] = new int[count];
        for (int i = 0; i < count; i++) {
            newArr[i] = temp[i];
        }
        return newArr;
    }
}
