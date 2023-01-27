import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<Integer>(); 
        for(int i=0;i<n;i++)l.add(i,sc.nextInt());
        int q = sc.nextInt();
        
        for(int x=0;x<q;x++){
            sc.nextLine();
            String s = sc.nextLine();
            if(s.charAt(0)=='I'){
                int a = sc.nextInt();
                int b = sc.nextInt();
                l.add(a,b);
            }
            else{
                int d = sc.nextInt();
                l.remove(d);
            }
        }
        for(Integer x:l)System.out.print(x+" ");
    }
}
