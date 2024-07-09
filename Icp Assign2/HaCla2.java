/*The surface area of a cylinder can be defined as A=pie*(r)^2+2*pie*rh,where r and h are the radius height of the cylinder 
respectively.Write a java program to find the areas where r and h inputted from the command line argument.Hint: use Math.PI. */
package commandline;

public class HaCla2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r=Double.parseDouble(args[0]);
		double h=Double.parseDouble(args[1]);
		double ba=2*Math.PI*Math.pow(r, 2);
		double la=2*Math.PI*r*h;
		double sa=ba+la;
		System.out.println("the surface area of the cylinder is :"+sa);
	}

}
