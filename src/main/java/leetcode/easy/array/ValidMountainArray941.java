package leetcode.easy.array;

public class ValidMountainArray941 {

  public boolean validMountainArray(int[] arr) {
    if (arr.length < 3) {
      return false;
    }
    int curr = 1;
    boolean switched = false;
    while (curr < arr.length) {
      if (!switched && arr[curr - 1] >= arr[curr]) {
        if (curr == 1 || arr[curr - 1] == arr[curr]) {
          return false;
        }
        switched = true;
      }
      if (switched && arr[curr - 1] <= arr[curr]) {
        return false;
      }
      curr++;
    }
    return switched;
  }
}
