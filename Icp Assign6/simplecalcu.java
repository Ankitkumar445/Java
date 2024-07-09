/*Design a Simple Calculator using methods in java containing the following functionalities, 
namely, with Addition, Subtraction, Multiplication, Remainder, Division and Square Root. The 
signature of the methods are given below.
 public static int additionSimple(int x, int y)
 Two inputs, x and y. Return the result of adding x to y.
 public static int subtractionSimple(int x, int y)
 Two inputs, x and y. Return the result of subtracting x from y i.e y-x.
 public static int multiplicationSimple(int x, int y)
 Two inputs, x and y. Return the result of multiplying x to y i.e. x*y.
 public static double divisionSimple(int x, int y)
 Two inputs, x and y. Return the result of dividing y by x. Please check whether 
x is zero before dividing.
 public static int remainderSimple(int n, int m)
 Please make sure that remainderSimple() takes two inputs, namely, a number
(int) n and a number (int) m. The method should return the remainder of n 
divided by m.
 public static double squareRootSimple(int n)
 Takes one input, namely a number n, and returns the square root of the number. 
The return should be double. Please kindly make sure that the number n is 
positive. */

package ass6;
import java.util.Scanner;
public class simplecalcu {
public static int add(int x, int y) {
    return x + y;
}

public static int subtract(int x, int y) {
    return x - y;
}

public static int multiply(int x, int y) {
    return  x * y;
}

public static double divide(int x, int y) {
    return (double) x / y;
}

public static int remainder(int x, int y) {
    return x % y;
}

public static double squareRoot(int x) {
    return Math.sqrt(x);
}

public static void main(String[] args) {
    // Example usage
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two integers:");
    int x = sc.nextInt();
    int y = sc.nextInt();
    System.out.println("enter the oprarator: ");
    int choice = sc.nextInt();
       

    switch (choice) {
    case 1:
        System.out.println("Result: " + add(x, y));
        break;
    case 2:
        System.out.println("Result: " + subtract(x, y));
        break;
    case 3:
         System.out.println("Result: " + multiply(x, y));
        break;
    case 4:
        System.out.println("Result: " + divide(x, y));
         break;
    case 5:
        System.out.println("Result: " + remainder(x, y));
        break;
    case 6:
         System.out.println("Square root of " + x + ": " + squareRoot(x));
        System.out.println("Square root of " + y + ": " + squareRoot(y));
        break;
    default:
         System.out.println("Invalid choice");       
        }
        sc.close();
    }
}
