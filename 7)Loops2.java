import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q>0){
            int a,b,n;
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
           // System.out.println(a+" "+b+" "+n);
           for(int i=0;i<n;i++){
               
               int t = (int) Math.pow(2,i);
               int x = (1<<(i+1))-1;
               System.out.print(a+x*b+" ");
               
           }
           System.out.println(" ");
           q--;
        }
    }
}
