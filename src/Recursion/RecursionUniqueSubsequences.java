//Print all the unique subsequences of a string
package Recursion;

import java.util.HashSet;

public class RecursionUniqueSubsequences {
    public static void Subsequences(String str, int idx, String newstring, HashSet<String>set){
        if(idx==str.length()){
            if(set.contains(newstring)){
                return;
            } else{
                System.out.println(newstring);
                set.add(newstring);
                return;
            }
        }
        char currchar=str.charAt(idx);
        Subsequences(str,idx+1,newstring+currchar,set);
        Subsequences(str,idx+1,newstring,set);
    }

    public static void main(String[] args) {
         String str = "aaa";
         HashSet<String>set = new HashSet<>();
         Subsequences(str,0,"",set);
    }
}
