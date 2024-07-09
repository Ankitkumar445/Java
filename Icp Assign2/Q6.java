/*when a brick is dropped from a tower.it falls faster and faster until it hits the earth.the distance it 
travels is given by d=(1/2)gt^2.here d is in feet ,t is the time in seconds and g is 32.174.write a program
 that asks the user for the number of seconds and then prints out hte distance travelled. */ 
package la2;
import java.util.*;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ENTER NUMBER OF SECONDS :");
		Scanner sc = new Scanner(System.in);
		double t = sc.nextDouble();
		double g=32.174;
		double d = (1.0/2)*g*t*t;
		System.out.println("Distance travelled: "+d);
		sc.close();
	}

}
