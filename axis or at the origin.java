import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n==0&&m==0){
            System.out.println("Origin");
        }
        else if(m==0&&n>0){
            System.out.println("Positive X-Axis");
        }
        else if(m==0&&n<0){
            System.out.println("Negative X-Axis");
        }
        else if(n==0&&m>0){
            System.out.println("Positive Y-Axis");
        }
        else if(n==0&&m<0){
            System.out.println("Negative Y-Axis");
        }
    }
}
