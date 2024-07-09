/*Assign your favorite colors in an array. Identify 2 exceptions that may be generated & write
exceptional handler in Java */
package Assing3;
public class Q2 {
    public static void main(String[] args) {
        String[] arr={"red","blue","black",null};
        try{
            String a=arr[8];
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("array out of range"+e);
        }
        try{
            System.out.println(arr[4].length());
        }catch (NullPointerException n){
            System.out.println("the array field is null"+n);
        }
    }
}
