import java.io.*;
import java.util.*;

public class Solution {
    private static boolean canWin(int m,int[] game, int i){
        if(i<0 || game[i]==1)return false;
        if(i==game.length-1 || i+m>game.length-1)return true;
        
        game[i]=1;
        return (canWin(m,game,i-1) || canWin(m,game,i+1) || canWin(m,game,i+m));
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int n = sc.nextInt();
            int leap = sc.nextInt();
            int ar[] = new int[n];
            for(int j=0;j<n;j++)ar[j]=sc.nextInt();
            boolean flag = canWin(leap,ar,0);
            if(flag){
                System.out.println("YES");
            }
            else 
              System.out.println("NO");
        }
    }
}
