package Threaddemo1;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of number you want to print : ");
        int n = scanner.nextInt();
        if (n <= 3) {
            System.out.println("Please enter a value greater than 3.");
            return;
        }
        int a = 0, b = 1, c = 1;
        System.out.print(a + " " + b + " " + c + " ");
        int next;
        for (int i = 4; i <= n; i++) {
            next = a + b + c;
            System.out.print(next + " ");
            a = b;
            b = c;
            c = next;
        }
    }
}
