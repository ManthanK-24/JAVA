import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
        1) Sort String & convert entire string to upper or lowercase
        2) Use array of 26 size & check  
         */
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int ar[] = new int[26];
        int br[] = new int[26];
        int flag = 1;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)>='a' && a.charAt(i)<='z')
            {
                ar[a.charAt(i)-'a']++;
            }   
            else
            {
                ar[a.charAt(i)-'A']++;
            }
        }
        
        for(int i=0;i<b.length();i++)
        {
            if(b.charAt(i)>='a' && b.charAt(i)<='z')
            {
                br[b.charAt(i)-'a']++;
            }   
            else
            {
                br[b.charAt(i)-'A']++;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(ar[i]!=br[i]){
                flag=0;
                break;
            }
        }
        System.out.println((flag==1)?"Anagrams":"Not Anagrams");
    }
}
