package hacker_rank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class MiniMaxSum {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    miniMaxSum(arr);

    bufferedReader.close();
  }

  public static void miniMaxSum(List<Integer> arr) {
    if (arr == null || arr.isEmpty()) {
      return;
    }

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    long sum = 0;
    for (int i = 0; i < arr.size(); i++) {
      sum += arr.get(i);
      min = Math.min(min, arr.get(i));
      max = Math.max(max, arr.get(i));
    }
    System.out.println((sum - max) + " " + (sum - min));
  }

  void fizzBuzz(int n) {
    for (int i = 1; i < n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }

}
