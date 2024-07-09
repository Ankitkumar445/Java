/*PART-I
Static Implementation (Array Implementation)
A Queue is implemented statically by using an array of size MAX to hold the elements and it has 
two ends (integers) – front and rear. The ‘front’ stores the position of the current front element 
and ‘rear’ stores the position of the current rear element of the queue. The Queue elements can be 
integers, characters, strings or user defined data types. 
The operations to be performed on a Queue are 
(1)public static void insert(int Q[])-adding an element x to the rear end of the queue Q 
(2)public static void delete(int Q[])-deletes the element from the front of the queue Q 
(3)public static void display(int Q[])-display all the elements of the queue Q. 
(4)public static boolean is_full()-check if the queue is full or not. 
(5)public static boolean is_empty()-check if the queue is empty or not. 
Write a menu driven Java Program using class, methods and array, to construct a Queue and 
implement the above five operations. */

package Threaddemo1;
import java.util.Scanner;
public class StackDemo1 {
    public static final int MAX = 10;
    public static int push(int S[], int top, int x) {
        if (isFull(top)) {
            System.out.println("Stack is full");
            return top;
        }
        top++;
        S[top] = x;
        System.out.println("Pushed Element is:  "+x);
        return top;
    }

    public static int pop(int S[], int top) {
        if (isEmpty(top)) {
            System.out.println("Stack is empty");
            return top;
        }
        int data = S[top];
        top--;
        System.out.println("Popped element is: " + data);
        return top;
    }

    public static void display(int S[], int top) {
        if (isEmpty(top)) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Elements in the stack are:");
        for (int i = top; i >= 0; i--) {
            System.out.println(S[i]);
        }
    }
     public static boolean isEmpty(int top) {
        return (top == -1);
    }

    public static boolean isFull(int top) {
        return (top == MAX - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stack[] = new int[MAX];
        int top = -1;
        while (true) {
            System.out.println("****MENU****");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                    System.out.println("Exiting....");
                case 1:
                    System.out.println("Enter the element to be pushed");
                    int x = sc.nextInt();
                    top = push(stack, top, x);
                    break;
                case 2:
                    top = pop(stack, top);
                    break;
                case 3:
                    display(stack, top);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
