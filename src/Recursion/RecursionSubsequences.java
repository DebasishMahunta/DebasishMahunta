//Print all the subseqences of String.
package Recursion;

public class RecursionSubsequences {
    public static void Subsequences(String str,int idx,String newstring){
        if(idx==str.length()){
            System.out.println(newstring);
            return;
        }
        char currchar=str.charAt(idx);
        Subsequences(str,idx+1,newstring+currchar);
        Subsequences(str,idx+1,newstring);
    }
    public static void main(String args[]) {
        String str="abc";
        Subsequences(str,0," ");
    }
}
