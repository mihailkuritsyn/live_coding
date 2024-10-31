package interview.avito.livecoding;

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

//          2
//  1 2     5     8
//      3     6        11
//                      1

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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//  nlogn +m*
//  logn
//      n
public class Task2 {

  public int getNonSatisfyCount(int[] goods, int[] needs) {
    int res = 0;
    Set goodsSet = new HashSet();
    Arrays.sort(goods);
//    for () {
//      int res = 0;
//    }
    for (int i = 0; i < needs.length; i++) {
      if (goodsSet.contains(needs[i])) {
        continue;
      }
      int mid = goods.length / 2;

      int l = 0, r = goods.length - 1;
      while (r - l != 1) {
        if (needs[i] > goods[mid]) {
          l = mid;
        } else {
          r = mid;
        }
        mid = l + (r - l + 1) / 2;
      }
      res += Math.min(needs[i] - goods[l], goods[r] - needs[i]);
    }
    return res;
  }

}