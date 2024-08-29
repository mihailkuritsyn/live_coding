package leetcode.medium.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class InsertDeleteGetRandomBigOOne380 {

  static class RandomizedSet {

    private Map<Integer, Integer> map = new HashMap();
    private List<Integer> list = new ArrayList<>();
    private Random random = new Random();

    public RandomizedSet() {
    }

    public boolean insert(int val) {
      if (!map.containsKey(val)) {
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
      }
      return false;
    }

    public boolean remove(int val) {
      if (map.containsKey(val)) {
        int idxDelete = map.get(val);
        if (idxDelete != list.size() - 1) {
          Integer lastValue = list.get(list.size() - 1);
          list.set(idxDelete, lastValue);
          map.put(lastValue, idxDelete);
        }
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
      }
      return false;
    }

    public int getRandom() {
      int randomIdx = random.nextInt(list.size());
      return list.get(randomIdx);
    }
  }
}
