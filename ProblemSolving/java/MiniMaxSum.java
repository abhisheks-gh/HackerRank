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

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        byte minorIndex = 0, majorIndex = 0;

        // Computing minorIndex
        for (int i = 0; i < arr.size()-1; i++) {
            if (arr.get(i) < arr.get(i+1)) {
                minorIndex = (byte)i;
            }
        }
        // Computing majorIndex
        for (int i = 0; i < 4; i++) {
            if (arr.get(i) > arr.get(i+1)) {
                
            }
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}



