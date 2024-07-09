/* Define a class Person with two instance variables:
 name and age
and two member methods:
 setData(): set the details of the person.
 displayData(): display the details of the person.
Now, create two objects of class person and initialize one object value directly (by
using the dot(.) operator name: “Rohan” and age: 20 ). Accept your name and age
through the keyboard and set them to another object using the setData() method.
Now display both the member variables using the displayData() method. Also, check
who is younger. */
package Iter;

import java.util.Scanner;

class Person {
    String name;
    int age;

    void setData(String n, int a) {
        name = n;
        age = a;
    }

    void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

//    static Person youngerPerson(Person p1, Person p2) {

}

public class Older {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Rohan";
        p1.age = 20;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        Person p2 = new Person();
        p2.setData(name, age);

        System.out.println("Details of person 1:");
        p1.displayData();
        System.out.println("\nDetails of person 2:");
        p2.displayData();
        if (p1.age < p2.age) {
            System.out.println(p1.name + " is younger");

        } else {
            System.out.println(p2.name + " is younger");

        }
    }
}
