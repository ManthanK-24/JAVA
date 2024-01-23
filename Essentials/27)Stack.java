import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        String s = sc.nextLine();
        boolean flag = true;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')st.push(')');
            else if(s.charAt(i)=='{')st.push('}');
            else if(s.charAt(i)=='[')st.push(']');
            else if(st.size()==0){
                flag = false;
                break;
            }
            else if( s.charAt(i)!= st.peek()){
                flag=false;
                break;
            }
            else{
                st.pop();
            }
        }
        if(st.size()!=0)flag = false;
        System.out.println(flag);
        }
    }
}
