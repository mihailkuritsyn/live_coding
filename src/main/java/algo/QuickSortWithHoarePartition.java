package algo;

public class QuickSortWithHoarePartition {

  public static void sort(int[] array) {
    sortHelper(array, 0, array.length - 1);
  }

  private static void sortHelper(int[] array, int l, int r) {
    if (l < r) {
      int pivot = doHoarePartitioning(array, l, r);
      sortHelper(array, l, pivot);
      sortHelper(array, pivot + 1, r);
    }
  }

  private static int doHoarePartitioning(int[] array, int l, int r) {
    int pivot = array[l];
    int i = l;
    int j = r;

    while (true) {
      while (array[i] < pivot) {
        i++;
      }
      while (array[j] > pivot) {
        j--;
      }
      if (i < j) {
        swap(array, i, j);
        i++;
        j--;
      } else {
        return j;
      }
    }
  }

  private static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
