package leetcode.medium.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import leetcode.medium.array.InsertDeleteGetRandomBigOOne380.RandomizedSet;
import org.junit.jupiter.api.Test;

class InsertDeleteGetRandomBigOOne380Test {

  @Test
  public void test1() {
    RandomizedSet randomizedSet = new RandomizedSet();
    randomizedSet.insert(11); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
    randomizedSet.remove(22); // Returns false as 2 does not exist in the set.
    randomizedSet.insert(22); // Inserts 2 to the set, returns true. Set now contains [1,2].
    int random1 = randomizedSet.getRandom();// getRandom() should return either 1 or 2 randomly.

    assertTrue(random1 >= 11);
    randomizedSet.remove(11); // Removes 1 from the set, returns true. Set now contains [2].
    randomizedSet.insert(22); // 2 was already in the set, so return false.
    int random2 = randomizedSet.getRandom();// Since 2 is the only number in the set, getRandom() will always return 2.
    assertEquals(22, random2);
  }

  @Test
  public void test2() {
    RandomizedSet randomizedSet = new RandomizedSet();
    randomizedSet.insert(1);
    randomizedSet.insert(2);
    randomizedSet.insert(3);
    randomizedSet.remove(1);
    randomizedSet.remove(3);
    int random2 = randomizedSet.getRandom();
    assertEquals(2, random2);
  }

}