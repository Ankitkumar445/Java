/*Write a java program that randomly generates an integer between 1 and 12 and displays 
the English month name January, February… December for the number 1, 2… 12, 
accordingly.
 */
package firstproject;
public class Ha3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=1;
		int max=12;
		int cc =(int)(Math.random()*(max-min+1));
		System.out.println("The generated number is "+cc);
		switch (cc) {
		case 1 : 
			System.out.println("january");
			break;
		case 2 :
			System.out.println("february");
			break;
		case 3 : 
			System.out.println("march");
			break;
		case 4 :
			System.out.println("april");
			break;
		case 5 : 
			System.out.println("may");
			break;
		case 6 :
			System.out.println("june");
			break;
		case 7 : 
			System.out.println("july");
			break;
		case 8 : 
			System.out.println("august");
			break;
		case 9 :
			System.out.println("september");
			break;
		case 10 : 
			System.out.println("october");
			break;
		case 11 :
			System.out.println("november");
			break;
		case 12 : 
			System.out.println("december");
			break;
		}
	}
}
		
		
		

	


