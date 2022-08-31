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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int positivesCount = 0, negativesCount = 0, zerosCount = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) negativesCount++;
            else if (arr.get(i) > 0) positivesCount++;
            else zerosCount++;
        }
        
        System.out.format("%6f", (double)positivesCount / arr.size());
        System.out.println();
        System.out.format("%6f", (double)negativesCount / arr.size());
        System.out.println();
        System.out.format("%6f", (double)zerosCount / arr.size());
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
