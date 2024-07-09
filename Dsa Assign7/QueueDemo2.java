/*PART-II
Dynamic Implementation (Linked List Implementation)
A stack is implemented dynamically by using a Linked list where each node in the linked list has
two parts, the data element and the reference to the next element of the stack. The class
defintion of Node is given below.
class Node {
int info;
Node next;
}
The stack elements can be integers, characters, strings or user defined data types. There is no
restriction on how big the stack can grow.
The operations to be performed on a stack are
(1)public static Node push(Node top) - Add an element x to the stack S requires creation of
node containing x and putting it in front of the top node pointed by S. 
(2)public static Node pop(Node top)- Delete the top node from the stack S so that next
element becomes the top. 
(3)public static void display(Node top)- Display all the elements of Stack S.
Write a menu driven Java Program using class, methods and list, to construct a Stack and
implement the above three operations */

package Threaddemo1;
import java.util.Scanner;
class Node {
    int info;
    Node next;

    Node(int info) {
        this.info = info;
        this.next = null;
    }
}
public class QueueDemo2 {
    public static Node insert(Node rear, Node front, int x) {
        Node newNode = new Node(x);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Inserted " + x);
        return rear;
    }
    public static Node delete(Node rear, Node front) {
        if (front == null) {
            System.out.println("Queue is empty. Cannot delete.");
        } else {
            System.out.println("Deleted " + front.info);
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }
        return front;
    }
    public static void display(Node front) {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            Node temp = front;
            System.out.print("Queue elements: ");
            while (temp != null) {
                System.out.print(temp.info + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node rear = null, front = null;

        while (true) {
            System.out.println("****MENU****");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                    System.out.println("Exiting...");
                    break;
                case 1:
                    System.out.println("Enter element to insert:");
                    int x = sc.nextInt();
                    if (front == null) {
                        rear = front = insert(rear, front, x);
                    } else {
                        rear = insert(rear, front, x);
                    }
                    break;
                case 2:
                    front = delete(rear, front);
                    if (front == null) {
                        rear = null;
                    }
                    break;
                case 3:
                    display(front);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}