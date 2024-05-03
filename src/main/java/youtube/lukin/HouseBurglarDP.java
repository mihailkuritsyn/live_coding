package youtube.lukin;

public class HouseBurglarDP {
//    1, 2, 3, 1
//    1 - 1
//    1,2 - (1) or (0) + 2 - 2
//    1,2,3 - (1,2) or (1) + 3 =4
//    1,2,3,1 - (1,2,3) = 4 or (1,2) + 1 = 3

  public int cashAmount(int[] cash) {
    if (cash == null || cash.length == 0) {
      return 0;
    }
    if (cash.length == 1) {
      return cash[0];
    }

    int dpFirst = cash[0];
    int dpSecond = Math.max(cash[0], cash[1]);
    int tmp;
    for (int i = 2; i < cash.length; i++) {
      tmp = dpSecond;
      dpSecond = Math.max(dpSecond, dpFirst + cash[i]);
      dpFirst = tmp;
    }
    return dpSecond;
  }

  public int cashAmountAdditionalMemory(int[] cash) {
    if (cash == null || cash.length == 0) {
      return 0;
    }
    if (cash.length == 1) {
      return cash[0];
    }

    int[] A = new int[cash.length];
    A[0] = cash[0];
    A[1] = Math.max(cash[0], cash[1]);
    for (int i = 2; i < cash.length; i++) {
      A[i] = Math.max(A[i - 1], A[i - 2] + cash[i]);
    }
    return A[cash.length - 1];
  }
}
