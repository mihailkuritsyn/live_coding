package tinkoff.ira;

import java.util.Scanner;

//Недавно маленький Антон научился читать некоторые буквы! Точнее, он научился читать буквы R, S и М. Кроме того, набор из трех букв R, S, M ему кажется правильным, если в нем символ R находится раньше, чем символ М.
//Определите, является ли строка з правильной по мнению Антона.
//Формат входных данных
//Дана строка з из трех символов, содержащая один символ R, один символ S и один символ М.
//Формат выходных данных
//Выведите Y es, если символ R находится в строке з раньше, чем символ М. В противном случае выведите No.
public class FirstTask {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String input = scanner.nextLine().trim();

      if (input.indexOf('R') < input.indexOf('M')) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}