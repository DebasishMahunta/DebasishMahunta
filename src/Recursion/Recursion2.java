//print numbers from 1 to 5
package Recursion;

public class Recursion2 {
    public static void printNumber(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printNumber(n+1);
    }
    public static void main(String args[]){
        int n=1;
        printNumber(n);
    }
}
