/*Write a java program to convert a decimal integer to its corresponding octal representation*/
package Threaddemo1;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        int n = sc.nextInt();
        int octal = toOctal(n);
        System.out.println("Octal representation: " + octal);
        sc.close();
    }
    public static int toOctal(int dec) {
        int octal = 0, placeValue = 1;
        while (dec != 0) {
            octal += (dec % 8) * placeValue;
            placeValue *= 10;
            dec /= 8;
        }
        return octal;
    }
}
