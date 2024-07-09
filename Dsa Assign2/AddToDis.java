/*Write a Java code that would represent Distance object (meters, centimetres) using classes. The class definition include a parameterized
3
constructor, void display ( ) to display the instance variables, void sum
(Distance, Distance) to add two distances. Now write a main function
that creates a couple of Distance objects and demonstrates the addition
of two distances.
 */
package Iter;

import java.util.Scanner;
class Point {
    int x;
    int y;
    void input(){
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
    }
    double FindDistance(Point p1, Point p2){
        double distance=Math.sqrt(Math.pow(p2.x-p1.x,2)+Math.pow(p2.y-p1.y,2));
        System.out.println("Distance between two points is :"+distance);
        return distance;
    }

}
public class AddToDis {
    public static void main(String[] args) {
        Point p=new Point();
        p.input();
        Point p1=new Point();
        p1.input();
        double distance = p.FindDistance(p, p1);
        System.out.println("Distance between the two points is: " + distance);
    }

}
