package tinkoff.ira;

import java.util.Scanner;

//В самый что ни на есть обычный день Борис решил, что на протяжении следующих n дней он будет покупать своей маме букет ровно из трех цветов. Там, где живет Борис, существует всего лишь один
//магазин цветов, но зато в нем широкий асортимент: для каждого і от 0 до 10 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 в магазине есть ровно один уникальный цветок, стоящий 2 в степени i бурлей. К тому же в магазин ежедневно довозят цветы, которые были выкуплены.
//В і-й день у Бориса есть а_i бурлей, которые он готов потратить на букет. Борис хочет купить как
//можно более дорогой букет. Для каждого из n дней определите, за какую стоимость Борис купит букет, или сообщите, что на его деньги невозможно купить никакой букет из трех цветов.
//Формат входных данных
//Первая строка содержит число n (1 <= n <= 105) - количество дней, в течение которых Борис планирует покупать букеты.
//і-я из следующих n строк содержит число а_i (1 <= а_i <= 1000000000000000000) - количество бурлей, которое есть у
//Бориса в i-й день.
//Формат выходных данных
//Для каждого a_і в отдельной строке выведите, сколько бурлей Борис потратит на букет в і-й день, или
//-1, если он не может купить никакой букет ровно из трех цветов.
//Комментарий к примеру
//в первый день Борис может купить цветы стоимостей 2, 4 и 8; во второй день Борис может купить цветы стоимостей 1, 2 и 64;
//в третий день Борис не может купить цветы таким образом, чтобы составить букет из трех цветов и уложиться в сумму в 5 бурлей. реши задачу на языку java
public class SecondTask {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();

      for (int day = 0; day < n; day++) {
        long budget = scanner.nextLong();
        long maxCost = -1;

        for (int i = 0; i < 63; i++) {
          for (int j = i + 1; j < 63; j++) {
            for (int k = j + 1; k < 63; k++) {
              long cost = (1L << i) + (1L << j) + (1L << k);
              if (cost <= budget) {
                maxCost = Math.max(maxCost, cost);
              }
            }
          }
        }
        System.out.println(maxCost);
      }
    }
  }
}
