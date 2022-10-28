//Move all X to the end of the string
package Recursion;

public class RecursionMoveX {
    public static void MoveAllX(String str,int idx,int count,String newString){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currchar=str.charAt(idx);
        if(currchar=='x'){
            count++;
            MoveAllX(str,idx+1,count,newString);
        } else {
            newString+=currchar;
            MoveAllX(str,idx+1,count,newString);
        }
    }
    public static void main(String args[]){
        String str = "axbcxxd";
        MoveAllX(str,0,0,"");
    }
}
