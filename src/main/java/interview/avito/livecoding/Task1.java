package interview.avito.livecoding;

// Условие задачи
// Мы в Авито любим проводить соревнования, — недавно мы устроили чемпионат по шагам. И вот настало время подводить итоги!

// Необходимо определить userIds участников, которые прошли наибольшее количество шагов steps за все дни, не пропустив ни одного дня соревнований.

// Пример
// # Пример 1
// # ввод
// statistics = [
//         [{ userId: 1, steps: 1000 }, { userId: 2, steps: 1500 }],
//         [{ userId: 2, steps: 1000 }]
// ]

// # вывод
// champions = { userIds: [2], steps: 2500 }

// # Пример 2
// statistics = [
//         [{ userId: 1, steps: 2000 }, { userId: 2, steps: 1500 }],
//         [{ userId: 2, steps: 4000 }, { userId: 1, steps: 3500 }]
// ]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// # вывод
// champions = { userIds: [1, 2], steps: 5500 }
public class Task1 {

  class UserInfo {

    private Integer userId;
    private Integer steps;
  }

  class Champion {

    private List<Integer> userIds;
    private Integer steps;

    public Champion(List<Integer> userIds, Integer steps) {
      this.userIds = userIds;
      this.steps = steps;
    }
  }

  public Champion findChampion(List<List<UserInfo>> statistics) {

    Map<Integer, Integer> userDays = new HashMap<>();

    Map<Integer, Integer> statMap = new HashMap<>();
    for (List<UserInfo> statistic : statistics) {
      for (UserInfo user : statistic) {
        if (userDays.containsKey(user.userId)) {
          userDays.put(user.userId, userDays.get(user.userId) + 1);
        } else {
          userDays.put(user.userId, 1);
        }

        if (statMap.containsKey(user.userId)) {
          Integer steps = statMap.get(user.userId);
          statMap.put(user.userId, steps + user.steps);
        } else {
          statMap.put(user.userId, user.steps);
        }
      }
    }

    Integer max = 0;
    List<Integer> champIds = new ArrayList<>(statMap.size());
    for (Entry<Integer, Integer> entry : statMap.entrySet()) {
      if (userDays.containsKey(entry.getKey())
          && userDays.get(entry.getKey()) == statistics.size()) {
        if (entry.getValue() > max) {
          max = entry.getValue();
          champIds.clear();
          champIds.add(entry.getKey());
        } else if (entry.getValue().equals(max)) {
          champIds.add(entry.getKey());
        }
      }
    }

    return new Champion(champIds, max);
  }
}
