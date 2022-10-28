//Remove Duplicates in a String
package Recursion;

public class RecursionDuplicatesString {
    public static boolean[]map=new boolean[16];
    public static void removeDuplicates(String str,int idx,String newstring){
        if(idx==str.length()){
            System.out.println(newstring);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']){
            removeDuplicates(str,idx+1,newstring);
        } else {
            newstring+=currchar;
            map[currchar-'a']=true;
            removeDuplicates(str,idx+1,newstring);
        }
    }
    public static void main(String args[]){
        String str="abbccda";
        removeDuplicates(str,0,"");
    }
}
