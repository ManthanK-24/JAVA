import java.util.*;

class Solution
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int ar[] = new int [n+1];
        int mp[] = new int[n+1];
        for(int i=0;i<n;i++)
        {
            ar[i] = sc.nextInt();
            mp[ar[i]] = i;
           // System.out.println(ar[i]);
        }
        int ans = 0;
        
        for(int i=0;i<n;i++)
        {
            int ele = ar[i];
            if(ele!=i+1)
            {
                mp[ar[i]] = mp[i+1];
                mp[i+1] = i;
                ar[mp[ar[i]]] = ele; 
                ar[i] = i+1;
                ans++;
            }
        }
        System.out.println(ans);
        
        
    }
}
