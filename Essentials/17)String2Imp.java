import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*  1) new StringBuilder + reverse() + toString() 
         */
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(a.equals(new StringBuilder(a).reverse().toString())?"Yes":"No");
        // int count = 0;
        // for(int i=0;i<a.length()/2;i++){
        //     if(a.charAt(i)==a.charAt(a.length()-i-1))count++;
        
        // }
        // System.out.println((count==a.length()/2)?"Yes":"No");
    }
}
