

import java.util.*;

class Solution
{
    
    public static void main (String [] args)
    {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for(int tc=0; tc<t; tc++)
       {
           int n = sc.nextInt();
           int [] ar = new int [n];
           
           for(int i=0;i<n;i++)
           {
               ar[i] = sc.nextInt();
           }
           solve(ar,n);
       }         
    }
    public static void solve(int[] ar, int n)
    {
        int ans = 0;
        for(int i=n-1;i>=0;i--)
        {
            if(ar[i] - (i+1)>2)
            {
                System.out.println("Too chaotic");
                return;
            }
            for(int j=Math.max(0,ar[i]-2);j<i;j++)
            {
                if(ar[j] > ar[i])ans++;
            }
        }
        System.out.println(ans);
    }
}
