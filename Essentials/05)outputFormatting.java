import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* 
        System.out.printf("%-15s%03d", string, integer); is a format string that uses the printf method to print a string and an integer with specific formatting.

%-15s is a format specifier for the string argument. The - sign tells the printf method to left-align the string within a field of 15 characters. If the string is shorter than 15 characters, it will be padded with spaces on the right to fill the field. %03d is a format specifier for the integer argument. The 0 tells the printf method to pad the number with leading zeros if the number of digits is less than 3. The 3 sets the width of the field to 3
 */  
   Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
        
    }
}
