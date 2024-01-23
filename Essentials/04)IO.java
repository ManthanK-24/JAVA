import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        double d = sc.nextDouble();
        
        sc.nextLine();
        // Before scanning string check if \0 needs to added as above 
        String s = sc.nextLine();
        System.out.println("String: "+ s);
        System.out.println("Double: "+ d);
        System.out.println("Int: "+ n);
    }
}
