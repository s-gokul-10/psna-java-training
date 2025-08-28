import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j){
            while(!Character.isLetterOrDigit(arr[i])){
                i++;
            }
                while(!Character.isLetterOrDigit(arr[j])){
                    j--;
                    
                }
                if(i<j){
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j--;
                }
            }
        System.out.println(new String(arr));
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
