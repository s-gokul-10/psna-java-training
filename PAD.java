import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,sum=0;
        int n=sc.nextInt();
        for(i=1;i<n;i++){
            if(n%i==0)
                sum=sum+i;
        }
        if(sum==n)
            System.out.println("Perfect Number");
       else if(sum<n)
            System.out.println("Deficient Number");
        else
            System.out.println("Abundant Number");
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
