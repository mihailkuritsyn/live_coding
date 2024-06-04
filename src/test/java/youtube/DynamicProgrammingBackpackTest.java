package youtube;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DynamicProgrammingBackpackTest {

  DynamicProgrammingBackpack target = new DynamicProgrammingBackpack();

  @Test
  void pack() {
    int[] w = new int[]{3, 4, 5, 8, 9};
    int[] p = new int[]{1, 6, 4, 7, 6};
    List<Integer> pack = target.pack(w, p, 13);
    System.out.println(pack);
    Assertions.assertEquals(List.of(4, 2), pack);
  }
}