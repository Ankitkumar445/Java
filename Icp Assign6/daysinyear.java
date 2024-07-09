/*Write a method that returns the number of days in a year using the following header:
public static int numberOfDaysInAYear(int year)
Write a java program that displays the number of days in year from 2000 to 2020. */
package ass6;
public class daysinyear {
	public static void main(String[]args) {
		int s=0;int d=0;
		for (int i=2000;i<=2020;i++) {
			d=numberOfDaysInAYear(i);    
			s=s+d;
		}
		System.out.println(s);
	}
	static int numberOfDaysInAYear(int year) {
	if(year % 4 == 0 && year % 100 != 0) {
		return 366;
	 } else {
		return 365;
	 }	
	}
}
