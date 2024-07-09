/* Write a java program which displays an appropriate name for a person, using a 
combination of nested ifs and compound conditions. Ask the user for a gender, first 
name, last name and age. If the person is female and 20 or over, ask if she is married. 
If so, display "Mrs." in front of her name. If not, display "Ms." in front of her name. If 
the female is under 20, display her first and last name. If the person is male and 20 or 
over, display "Mr." in front of his name. Otherwise, display his first and last name. Note 
that asking a person if they are married should only be done if they are female and 20 
or older, which means you will have a single if and else nested inside one of your if 
statements. Also, did you know that with an if statements (or else), the curly braces are 
optional when there is only one statement inside?*/
package firstproject;
import java.util.Scanner;

public class Ha5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your gender (m or f):");
        char g = sc.next().charAt(0);
        System.out.println("First name:");
        String fn = sc.next();
        System.out.println("Last name:");
        String ln = sc.next();
        System.out.println("Age:");
        int a = sc.nextInt();

        if ( g == 'F' || g == 'f') {
            System.out.println("Are you married, " + fn + " (y or n)?");
            char m = sc.next().charAt(0);
            if (a >=20) {
                if (m == 'y' || m == 'Y') {
                    System.out.println("Then I will call you Mrs. " + fn + " " + ln);
                } else {
                    System.out.println("Then I will call you Mr. " + fn + " " + ln);
                }
            } else {
                System.out.println("Then I will call you " + fn+".");
            }
        } else {
            if (a >= 20) {
                System.out.println("Then I will call you MR. " + fn + ".");
            } else {
                System.out.println("Then I will call you " + fn + " " + ln);
            }
        }
    }
}
        
    
