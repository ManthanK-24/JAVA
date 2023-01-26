import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int k = sc.nextInt();
        String hi=s.substring(0,k),lo = s.substring(0,k);
        for(int i=0;i<=s.length()-k;i++)
        {
            String t = s.substring(i,i+k);
            if(i==0)hi=t;
            else
            {
                if(t.compareTo(hi)>0){
                    hi = t;
                }
            }
            if(i==0)lo=t;
            else
            {
                if(t.compareTo(lo)<0){
                    lo = t;
                }
            }
            
        }
        System.out.println(lo);
        System.out.println(hi);
    }
}
