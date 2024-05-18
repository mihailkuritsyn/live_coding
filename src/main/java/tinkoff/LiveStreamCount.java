package tinkoff;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LiveStreamCount {
//  Ваша задача: посчитать максимальное количество пользователей, одновременно смотревших игровой стрим.
//
//  Каждый пользователь подключался к стриму в какой-то момент времени t_in
//  и отключался в момент времени t_out – время измеряется в секундах (от 0 до 10^9).
//  У каждого пользователя это время своё.
//
//  Вам дан массив (неупорядоченный) из пар (t_in, t_out) – длина массива от 0 до 10^6.
//  Требуется вывести число – максимальное количество пользователей, которые одновременно смотрели стрим.
//
//  Примеры
//
//      [ ] -> 0
//
//      [(1, 5), (5, 10)] -> 1
//
//      [(1, 5), (0, 1), (4, 5)] -> 2
//
//      [(1, 10), (5, 6), (2, 3), (7, 8)] -> 2
//
//      [(1, 2), (1, 10), (4, 9), (8, 15), (5, 6), (8, 16)] -> 4

  public static class Pair {

    public int start;
    public int end;

    public Pair(int start, int end) {
      this.start = start;
      this.end = end;
    }
  }

  public int countRate(Pair[] sessions) {
    if (sessions == null || sessions.length == 0) {
      return 0;
    }
    Map<Integer, Integer> timelineMap = new HashMap<>();
    for (Pair pair : sessions) {
      if (timelineMap.containsKey(pair.start)) {
        timelineMap.put(pair.start, timelineMap.get(pair.start) + 1);
      } else {
        timelineMap.put(pair.start, 1);
      }

      if (timelineMap.containsKey(pair.end)) {
        timelineMap.put(pair.end, timelineMap.get(pair.end) - 1);
      } else {
        timelineMap.put(pair.end, -1);
      }
    }

    int maxCount = 0;
    int currCount = 0;
    timelineMap = new TreeMap<>(timelineMap);
    for (Entry<Integer, Integer> entry : timelineMap.entrySet()) {
      currCount += entry.getValue();
      maxCount = Math.max(maxCount, currCount);
    }
    return maxCount;
  }
}
