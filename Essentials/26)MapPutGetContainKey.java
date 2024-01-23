import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++){
            
            String name = sc.nextLine();
            int number = sc.nextInt();
            sc.nextLine();
            m.put(name,number);
           // System.out.println(name+" "+number);
        }
        while(sc.hasNext()){
            //System.out.println(sc.nextLine());
            String s= sc.nextLine();
            System.out.println(m.containsKey(s)?s+"="+m.get(s):"Not found");
        }
    }
}
