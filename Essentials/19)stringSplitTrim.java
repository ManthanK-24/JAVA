import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*   Regex is danger -> \\s imp at last
         */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int n = s.length();
        if(n>0){
            String words[] = s.split("[!,?._'@\\s]+");
            int x = words.length;
            System.out.println(x);
            for(int i=0;i<x;i++)System.out.println(words[i]);
        }
        else 
           System.out.println("0");
    }
}
