/*Write a java program to create an array of size N and store the random values in it and find the
sum and average.
*/
package Threaddemo1;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter elements: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / N;
        System.out.println("Sum = "+ sum + "\nAverage = " + avg);
        sc.close();
    }
}
