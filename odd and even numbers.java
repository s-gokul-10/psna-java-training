import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0){
                even++;
                
            }
            else{
               odd++;
            }
             
        }
       System.out.println("Odd = "+odd);
        System.out.println("Even = "+even);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
