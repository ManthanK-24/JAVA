import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        ArrayList<ArrayList<Integer>> arList = new ArrayList<ArrayList<Integer>>(n);
        for(int i=0;i<n;i++){
            int d = sc.nextInt();
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for(int j=0;j<d;j++)ar.add(sc.nextInt());
            arList.add(ar);    
        }
        int q = sc.nextInt();
        while(q>0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            try{
                System.out.println(arList.get(x-1).get(y-1));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
            q--;
        }
        
    }
}
