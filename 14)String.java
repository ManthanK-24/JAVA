import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
        I/P 
        hello
        java
        O/P
        9 
        No
        Hello Java
        
        1) String comparisons 
        a.compareTo(b)
        s1 == s2 : The method returns 0.
        s1 > s2 : The method returns a positive value.
        s1 < s2 : The method returns a negative value.
        2)  a = a.substring(0,1).toUpperCase() + a.substring(1);
         */
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int x = a.length() + b.length();
        System.out.println(x);
        if(a.compareTo(b) >0 )
        System.out.println("Yes");
        else
        System.out.println("No");
        a = a.substring(0,1).toUpperCase() + a.substring(1);
        b = b.substring(0,1).toUpperCase() + b.substring(1);
        System.out.println(a+" "+b);
        
    }
}
