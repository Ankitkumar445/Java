/*PART-II
Dynamic Implementation (Linked List Implementation)
A Queue is implemented dynamically by using a Linked list where each node in the linked list has 
two parts, the data element and the reference to the next element of the queue. 
The class definition of Node is given below. 
class Node { 
int info; 
Node next; 
}
The Queue elements can be integers, characters, strings or user defined types. There is no restriction
on how big the Queue can grow. 
The operations to be performed on a Queue: 
public static Node insert (Node rear, Node front) - adding an element x to the queue 
Q requires creation of node containing x and putting it next to the rear and rear points to the newly 
added element. 
public static Node delete (Node rear, Node front) - deletes the front node from the 
queue Q
 
public static void display (Node rear, Node front)-display all the elements of 
the queue Q. 
Write a menu driven Java Program using class, methods and list, to construct a Queue and 
implement the above three operations. */

package Threaddemo1;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class StackDemo2 {

    static Scanner sc = new Scanner(System.in);
    public static Node push(Node top) {
        System.out.println("Enter the element to be pushed");
        int x = sc.nextInt();
        Node newnode = new Node(x);
        if(top==null){
            top = newnode;
            return top;
        }
        newnode.next = top;
        top = newnode;
        return top;
    }

    public static Node pop(Node top) {
        if (top == null) {
            System.out.println("Stack Underflow");
            return top;
        }
        System.out.println("Element popped: " + top.data);
        top = top.next;
        return top;
    }

    public static void display(Node top) {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node top = null;
        while (true) {
            System.out.println("****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Push");
            System.out.println("2:Pop");
            System.out.println("3:Display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    top = push(top);
                    break;
                case 2:
                    top = pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}


