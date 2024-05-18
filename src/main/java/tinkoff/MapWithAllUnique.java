package tinkoff;

import java.util.HashMap;
import java.util.Map;

class MapWithAllUnique {
  // const map = new MapWithAllUnique();
// map.isAllUnique() => true
// map.put("a",1);
// map.isAllUnique() => true
// map.put("b",2);
// map.isAllUnique() => true
// map.put("c",1);
// map.isAllUnique() => false
// map.put("a",3);
// map.isAllUnique() => true

  // a 1 | 1- 1
//  b 2  | 1- 1
//       | 2 -1

//  c 1  | 1- 2
//       | 2 -1

//  a 3  | 1- 2 (-1) 1-1
//       | 2 -1
//       | 3 -1


  private final Map<String, Integer> map = new HashMap<>();
  private final Map<Integer, Integer> valueCount = new HashMap<>();

  public Integer put(String key, Integer value) {
    if (valueCount.containsKey(value)) {
      valueCount.put(value, valueCount.get(value) + 1);
    } else {
      valueCount.put(value, 1);
    }

    if (map.containsKey(key)) {
      Integer oldVal = map.get(key);

      Integer existCount = valueCount.get(oldVal);
      if (existCount - 1 == 0) {
        valueCount.remove(oldVal);
      } else {
        valueCount.put(oldVal, existCount - 1);
      }
    }
    return map.put(key, value);
  }

  public Integer get(String key) {
    return map.get(key);
  }

  public Integer remove(String key) {
    if (map.containsKey(key)) {
      Integer value = map.get(key);
      if (valueCount.get(value) - 1 == 0) {
        valueCount.remove(value);
      } else {
        valueCount.put(value, valueCount.get(value) - 1);
      }

      return map.remove(key);
    }
    return -1;
  }

  public boolean isAllUnique() {
    return valueCount.size() == map.size();
  }
}
