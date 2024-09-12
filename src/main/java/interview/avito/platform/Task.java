package interview.avito.platform;

public class Task {


  /**
   * Класс, используемый для подсчёта наименьшего значения в окне размером w.
   */
//  public class SlidingWindowMin {
//
//    private final w;
//    private final List<Integer> queue = new LinkedList<>();
//
//    public SlidingWindowMin(int w) {
//      this.w=w;
//    }
//
//    /**
//     * Добавляет новое значение в окно. В случае, если размер окна превышает w,
//     * удаляет значение из начала окна.
//     */
//    public void add(int value) { // O(1)
//      if(queue.size() == w){
//        queue.remove(0);
//      }
//      queue.add(value);
//    }
//
//    /**
//     * Возвращает наименьшее значение в окне.
//     */
//    public int getMin() { // O(n)
//      return queue.stream().max();
//    }
//
//    public static void main(String[] args) {
//      SlidingWindowMin window = new SlidingWindowMin(3);
//      for (int i = 4; i < 14; i++) {
//        int curValue = 34 % i;
//        window.add(curValue);
//        System.out.format("curValue = %2d , minValue = %2d\n", curValue, window.getMin());
//        // curValue =  2 , minValue =  2
//        // curValue =  4 , minValue =  2
//        // curValue =  4 , minValue =  2
//        // curValue =  6 , minValue =  4
//        // curValue =  2 , minValue =  2
//        // curValue =  7 , minValue =  2
//        // curValue =  4 , minValue =  2
//        // curValue =  1 , minValue =  1
//        // curValue = 10 , minValue =  1
//        // curValue =  8 , minValue =  1
//      }
//    }
//  }
}
