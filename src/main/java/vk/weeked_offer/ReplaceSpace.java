package vk.weeked_offer;

/**
 * Написать метод, который заменит все пробелы в массиве на "%20" inplace. На вход подается массив с
 * зарезервированными под расширение символами в конце массива. Пример: Input: ['j','a','v','a','
 * ','t','a','s','k', '\0', '\0'] Output: ['j','a','v','a','%','2','0','t','a','s','k']
 * <p>
 * Ограничения: O(1) по памяти, O(N) по времени, необходимо менять исходный массив.
 */

//'j','a',' ','\0', '\0'
// 0   1.  2.   3.    4
//

//' ', '\0', '\0'

//' ', a', '\0', '\0'
//' ', a', '\0', 'a'

public class ReplaceSpace {

  public char[] urlEncodeSpaces(char[] input) {
    if (input.length == 0) {
      return input;
    }

    int j = input.length - 1;
    for (int i = input.length - 1; i >= 0; i--) {
      if (input[i] == ' ') {
        input[j--] = '0';
        input[j--] = '2';
        input[j--] = '%';
      } else if (input[i] != '\0') {
        input[j--] = input[i];
      }
    }
    return input;
  }
}