/* PART-I
Static Implementation (Array Implementation)
A stack is implemented statically by using an array of size MAX to hold stack elements and an
integer top storing the position of top of the stack. The stack elements can be integers, characters,
strings or user defined data types.
The operations to be performed on a stack are
(1)public static int push(int S[],int top) – adding an element x to the stack S
(2)public static int pop(int S[],int top)– deletes and returns the top element from the stack 
(3)public static void display(int S[],int top)- display all the elements of Stack S
(4)public static boolean isEmpty(int top) – check if the stack is empty
(5)public static boolean isFull(int top) – check if the stack is full when top equals MAX -1
Write a menu driven Java Program using class, methods and array, to construct a Stack and
implement the above five operations.*/

package Threaddemo1;
import java.util.Scanner;
public class QueueDemo1 {
    static Scanner sc = new Scanner(System.in);
    public static final int MAX=5;
    public static int front=-1;
    public static int rear=-1;
    public static boolean is_full() {
        return rear==MAX-1;
    }
    public static boolean is_empty() {
        return rear==-1;
    }
    public static void insert(int queue[]) {
        if(is_full()) {
            System.out.println("The queue is full.");
        } else {
            System.out.println("Enter the Element: ");
            int data = sc.nextInt();
            rear = rear + 1;
            queue[rear] = data;
            System.out.println("Data inserted: "+data);
            if(front==-1){
                front = front+1;
            }
        }
    }
    public static void delete(int queue[]) {
        if(is_empty()){
            System.out.println("The queue is empty.");
        } else{
            int del = queue[front];
            front = front + 1;
            System.out.println("Data deleted: "+del);
        }
    }
    public static void display(int queue[]){
        if(front==-1 || front>rear){
            System.out.println("Queue is Empty.");
        } else{
            System.out.println("The Queue is: ");
            for(int i=front;i<=rear;i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int queue[]=new int[MAX];
        while(true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    insert(queue);
                    break;
                case 2:
                    delete(queue);
                    break;
                case 3:
                    display(queue);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}