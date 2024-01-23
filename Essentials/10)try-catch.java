import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* A static initialization blocks allows more complex initialization, for example using conditionals:

static double a;
static {
    if (SomeCondition) {
      a = 0;
    } else {
      a = 1;
    }
} 

  */
  Scanner input = new Scanner(System.in);
  int B = input.nextInt();
  int H = input.nextInt();
    try{
        if(B <= 0 || H <= 0){
            throw new Exception("Breadth and height must be positive");
        }
        else{
            System.out.println(B*H);
        }
    }catch(Exception e){
        System.out.println(e);
    }

}
    
}
