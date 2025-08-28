import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int spl=0,l=0,n=0;
        for(int i=0;i<=a.length()-1;i++){
            char c=a.charAt(i);
            if(c>=97 &&c<=122)
                l++;
           
            else if(c>=48&&c<=57)
                n++;
            else
                spl++;
        }
        System.out.println(spl);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
