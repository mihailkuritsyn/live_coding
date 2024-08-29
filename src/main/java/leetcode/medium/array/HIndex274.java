package leetcode.medium.array;

//Given an array of integers citations where citations[i]
// is the number of citations a researcher received for
// their ith paper, return the researcher's h-index.
//
//According to the definition of h-index on Wikipedia: The h-index
// is defined as the maximum value of h such that the given
// researcher has published at least h papers that have each been
// cited at least h times.
public class HIndex274 {

  public int hIndex(int[] citations) {
    int[] countMap = new int[citations.length + 1];
    for (int i = 0; i < citations.length; i++) {
      if (citations[i] > citations.length) {
        countMap[citations.length]++;
      } else {
        countMap[citations[i]]++;
      }
    }

    int bonus = 0;
    for (int i = countMap.length - 1; i >= 1; i--) {
      if (countMap[i] + bonus >= i) {
        return i;
      }
      bonus += countMap[i];
    }
    return 0;
  }
}
