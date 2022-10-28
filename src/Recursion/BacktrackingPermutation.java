// print al permutations

package Recursion;

public class BacktrackingPermutation {
    public static void printPermutation(String str,String per,int idx){
        if(str.length()==0){
            System.out.println(per);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currchar = str.charAt(i);
            String newstring = str.substring(0,i)+str.substring(i+1);
            printPermutation(newstring,per+currchar,idx+1);
        }
    }
    public static void main(String args[]){
       String str = "abc";
       printPermutation(str,"",0);
    }
}
