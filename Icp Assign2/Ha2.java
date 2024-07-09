/* If you have N eggs,then you have N/12 dozen eggs,with N%12 eggs left over.Write a java program that
 asks the user how many eggs she has and then tells the user how many dozen eggs she has and how many 
 eggs are left over .Agross of eggs is equal to the 144 eggs.Extend your program so that it will tell t
 he user how many gross,how many dozens,and how many left over eggs she has.*/
package la2;
import java.util.*;
public class Ha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total number of eggs: ");
        int totalEggs = sc.nextInt();

        int grossCount = totalEggs / 144;
        totalEggs %= 144;

        int dozenCount = totalEggs / 12;
        totalEggs %= 12;

        System.out.println("Number of gross eggs: " + grossCount);
        System.out.println("Number of dozen eggs: " + dozenCount);
        System.out.println("Number of leftover eggs: " + totalEggs);

        sc.close();
    }
}
