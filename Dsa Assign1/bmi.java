/*The body mass index (BMI) is commonly used by health and nutrition professionals to estimate 
human body fat in populations. It is computed by taking the individual's weight (mass) in 
kilograms and dividing it by the square of their height in meters. i.e.
Metric: BMI = 𝑾𝒆𝒊𝒈𝒉𝒕 (𝒌𝒈)/(𝑯𝒆𝒊𝒈𝒉𝒕)𝟐 (𝒎𝟐)
Write a java program by using conditional statement to show the category for a given BMI.
Category         |    BMI
Less than 18.5   | Underweight
18.5 to 24.9     | Normal Weight
25.0 to 29.9     | Overweight
30.0 or more     | Obese */
package normalprog;
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the person weight:");
		double x=obj.nextDouble();
		System.out.print("Enter the person height in meter:");
		double y=obj.nextDouble();
		double bmi=(x)/(y*y);
		if(bmi<18.5) {
			System.out.println("underweight");
		}
		else if(bmi>=18.5 && bmi<=24.5) {
			System.out.println("normal weight");
		} else if(bmi>=25.0 && bmi<=29.9) {
			System.out.println("overweight");
		} else {
			System.out.println("you are obese");
		}

	}

}
