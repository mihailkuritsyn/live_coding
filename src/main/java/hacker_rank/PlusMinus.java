package hacker_rank;


import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

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

  static class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
      if (arr == null || arr.isEmpty()) {
        return;
      }
      double positiveCount = 0;
      double negativeCound = 0;
      double zeroCount = 0;
      for (Integer i : arr) {
        if (i > 0) {
          positiveCount++;
        } else if (i < 0) {
          negativeCound++;
        } else {
          zeroCount++;
        }
      }
      System.out.printf("%.6f%n", positiveCount / arr.size());
      System.out.printf("%.6f%n", negativeCound / arr.size());
      System.out.printf("%.6f%n", zeroCount / arr.size());
    }

  }

}
