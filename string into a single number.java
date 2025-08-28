import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int count=0;
        String ans="";
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c>='0' && c<='9')
            {
                ans=ans+c;
            }
                
           
        }        
        if(ans==""){
            System.out.print("0");
            
        }
        else{
            System.out.println(ans);
        }
    }
}
