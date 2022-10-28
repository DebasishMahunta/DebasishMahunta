package Recursion;
import java.util.*;

public class Pinku {
    static int fact(int number){
        int f=1;
        while(number != 0){
            f =f*number;
            number--;
        }
        return f;
    }
    static boolean checkNumber(int number){
        int sum = 0;
        int tempNumber = number;
        while(tempNumber != 0){
            sum = sum+fact(tempNumber%10);
            tempNumber = tempNumber/10;
        }
        if(sum ==  number)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        n = sc.nextInt();
        if(checkNumber(n))
            System.out.println(n+"pinku");
        else
            System.out.println(n+" me ");
    }
}
