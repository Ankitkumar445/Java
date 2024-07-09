/*Write a java program that prompts the user to enter an integer for today’s day of the 
week (Sunday is 0, Monday is 1… and Saturday is 6). Also prompt the user to enter 
the number of days after today for a future day and display the future day of the week.  */
package firstproject;
import java.util.Scanner;
public class Ha2 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter today's day :");
		int x=sc.nextInt();
		String str="";
		String str1 ="";
		switch (x) {
		case 0 : 
			str = "sunday";
			System.out.println(str);
			break;
		case 1 :
			str = "monday";
			System.out.println(str);
			break;
		case 2 : 
			str = "tuesday";
			System.out.println(str);
			break;
		case 3 :
			str = "wednesday";
			System.out.println(str);
			break;
		case 4 : 
			str = "thursday";
			System.out.println(str);
			break;
		case 5 :
			str = "friday";
			System.out.println(str);
			break;
		case 6 : 
			str = "saturday";
			System.out.println(str);
			break;
		}
		System.out.println("enter the day elapsed since today :");
		int y=sc.nextInt();
		int s=(x+y)%7;
		
		switch (s) {
		case 0 : 
			str1 = "sunday";
			System.out.println(str1);
			break;
		case 1 :
			str1 = "monday";
			System.out.println(str1);
			break;
		case 2 : 
			str1 = "tuesday";
			System.out.println(str1);
			break;
		case 3 :
			str1 = "wednesday";
			System.out.println(str1);
			break;
		case 4 : 
			str1 = "thursday";
			System.out.println(str1);
			break;
		case 5 :
			str1 = "friday";
			System.out.println(str1);
			break;
		case 6 : 
			str1 = "saturday";
			System.out.println(str1);
			break;
		
		}
		
		System.out.println("Today is " + str + " and the future day is "+ str1);
		

	}

}
