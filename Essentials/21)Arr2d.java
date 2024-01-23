import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // List<List<Integer>> arr = new ArrayList<>();

        // IntStream.range(0, 6).forEach(i -> {
        //     try {
        //         arr.add(
        //             Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //                 .map(Integer::parseInt)
        //                 .collect(toList())
        //         );
        //     } catch (IOException ex) {
        //         throw new RuntimeException(ex);
        //     }
        // });

        // bufferedReader.close();
        Scanner sc = new Scanner(System.in);
        int ar[][] = new int[6][6];
        int mxsum = Integer.MIN_VALUE;
        for(int i=0;i<6;i++)
        {   int sum=0;
            for(int j=0;j<6;j++)
            {
                ar[i][j] = sc.nextInt();
                if(i>1 && j>1)
                {
                    sum = ar[i][j]+
                          ar[i][j-1]+
                          ar[i][j-2]+
                          ar[i-1][j-1]+
                          ar[i-2][j]+
                          ar[i-2][j-1]+
                          ar[i-2][j-2];
                    if(sum>mxsum){mxsum=sum;}
                }
                
            }
        }
        System.out.println(mxsum);
    }
}
