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
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
          userDays.put(user.userId, userDays.get(user.userId) + 1))
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
      if (userDays.containsKey(entry.getKey()) && userDays.get(entry.getKey()) == statistics.size()) {
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

// Условие задачи
// На Авито размещено множество товаров, каждый из которых представлен числом.
// У каждого покупателя есть потребность в товаре, также выраженная числом.
// Если точного товара нет, покупатель выбирает ближайший по значению товар, что вызывает неудовлетворённость,
// равную разнице между его потребностью и купленным товаром.
// Количество каждого товара не ограничено, и один товар могут купить несколько покупателей.
// Рассчитайте суммарную неудовлетворённость всех покупателей.

// Нужно написать функцию, которая примет на вход два массива: массив товаров и массив потребностей покупателей,
// вычислит сумму неудовлетворённостей всех покупателей и вернет результат в виде числа.

// Пример
// # Пример
// # ввод
// goods = [8, 3, 5]
// buyerNeeds = [5, 6]
// # вывод
// res = 1
// # первый покупатель покупает товар 5 и его неудовлетворённость = 0,
// # второй также покупает товар 5 и его неудовлетворённость = 6-5 = 1


//3,5,8

// 1 2 3 4 5.      10
//             7
// 0 1 2 3 4       5
// need = 7
// mid = 3 midVal=4 l=0 r=5
// l=3 r=5 mid=3+1=4
//midVal=5 l=4

// 1 2
//     3 4
// 3
// needs [6]
// goods [1,2]

//  nlogn +m*
//  logn
//      n


//  public getNonSatisfyCount(int[] goods, int[] needs) {
//    Set goodsSet = new HashMap();
//    Arrays.sort(goods);
//    for () {
//      int res = 0;
//    }
//    for (int i = 0; i < needs.size; i++) {
//      if (goodsSet.containsKey(needs[i])) {
//        continue;
//      }
//      int mid = goods.size / 2;
//
//      int l = 0, r = goods.size - 1;
//      while (r - l != 1) {
//        if (needs[i] > goods[mid]) {
//          l = mid;
//        } else {
//          r = mid;
//        }
//        mid = l + (r - l + 1) / 2;
//      }
//      res += Math.min(needs[i] - goods[l], goods[r] - needs[i]);
//    }
//  }
}
