import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
         double d=(double)a/b;
        int c=a%b;
        System.out.printf("%d / %d = %.6f\n",a,b,d);
        
        System.out.println(a +" % "+ b + " = "+c);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
