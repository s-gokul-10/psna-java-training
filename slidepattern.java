import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int i,j,sp;
        int n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(sp=1;sp<=n-i;sp++)
                System.out.print(" ");
            for(j=1;j<=n;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
