package leetcode.easy.hash;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {

//  public boolean containsNearbyDuplicate(int[] nums, int k) {
//    Map<Integer, Integer> indexMap = new HashMap<>();
//    for (int i = 0; i < nums.length; i++) {
//      if (indexMap.containsKey(nums[i])) {
//        if (i - indexMap.get(nums[i]) <= k) {
//          return true;
//        }
//      }
//      indexMap.put(nums[i], i);
//    }
//    return false;
//  }

  public boolean containsNearbyDuplicate(int[] nums, int k) {
    if (nums.length < 2 || k == 0) {
      return false;
    }
    Set<Integer> kSizeSet = new HashSet<>(k + 1);
    int counter = 0;
    for (int num : nums) {
      if (!kSizeSet.add(num)) {
        return true;
      }

      if (kSizeSet.size() > k) {
        kSizeSet.remove(nums[counter++]);
      }
    }
    return false;
  }
}
