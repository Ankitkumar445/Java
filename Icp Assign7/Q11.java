/*Write a sort method that uses the bubble-sort algorithm. The bubble sort algorithm makes
several passes through the array. On each pass, successive neighbouring pairs are compared. If a
pair is not in order, its values are swapped; otherwise, the values remain unchanged. The
technique is called a bubble sort or sinking sort because the smaller values gradually “bubble”
their way to the top and the larger values “sink” to the bottom. Write a java program that reads
in ten double numbers, invokes the method, and displays the sorted numbers.
*/
package Threaddemo1;
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        System.out.print("Sorted array: " );
        for (int j : arr) {
            System.out.print(j + " ");
        }
        sc.close();
    }
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

