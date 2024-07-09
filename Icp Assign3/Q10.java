package programingassignment3;
import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks secured by the students");
		int m=sc.nextInt();
		int c = 0;
		if (m>=90)
			c=1;
		else if (m>=80 && m<90)
			c=2;
		else if (m>=70 && m<80)
			c=3;
		else if (m>=60 && m<70)
			c=4;
		else if (m>=50 && m<60)
			c=5;
		else if (m>=40 && m<50)
			c=6;
		else
			c=7;
		switch(c) {
		case 1:
			System.out.println('O');
			break;
		case 2: 
			System.out.println('A');
			break;
		case 3:
			System.out.println('B');
			break;
		case 4:
			System.out.println('C');
			break;
		case 5:
			System.out.println('D');
			break;
		case 6:
			System.out.println('E');
			break;
		case 7:
			System.out.println('F');
		}
		
	}
}