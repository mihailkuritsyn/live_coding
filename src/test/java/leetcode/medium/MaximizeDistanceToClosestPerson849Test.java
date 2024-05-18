package leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximizeDistanceToClosestPerson849Test {

  MaximizeDistanceToClosestPerson849 target = new MaximizeDistanceToClosestPerson849();

  @Test
  void test1() {
//    1,0,0,0,1,0,1
//    l=0 r=0 s[l]==1 l++ r++
//    l=1 r=1
//    l=1 r=2
//    l=1 r=3
//    l=1 r=4 dist=3-1=2 maxDist=max(0, 2/2)=1 ind=l+(dist)/2=1+1
//    l=5 r=5
//    r==length-1? - false
//    l=5 r=6 dist=1 maxDist=max(1, 1/2)=1 ind=l+(dist)/2=5+0=5
    int res = target.maxDistToClosest(new int[]{1, 0, 0, 0, 1, 0, 1});
    Assertions.assertEquals(2, res);
  }

  @Test
  void test2() {
//    1,1,0
//    l=0 r=0
//    l=1 r=1
//    l=2 r=2 dist=0 maxDist=0/2=0  ind=l+(dist)/2=2+0=2
    int res = target.maxDistToClosest(new int[]{1, 1, 0});
    Assertions.assertEquals(1, res);
  }

  @Test
  void test3() {
//    0,0,1
//    l=0 r=0
//    l=0 r=1
//    l=0 r=2 dist=(2-0)-1=1 maxDist=1
//    l==0? true maxDist = dist ind = l
    int res = target.maxDistToClosest(new int[]{0, 0, 1});
    Assertions.assertEquals(2, res);
  }

  @Test
  void test4() {
//    1,1,0,0
//    l=0 r=0 s[l]==1 l++ r++
//    l=1 r=1 s[l]==1 l++ r++
//    l=2 r=2
//    l=2 r=3
//    r==length-1 && s[r]==0? true dist=3-2=1 maxDist=1 ind = r
    int res = target.maxDistToClosest(new int[]{1, 1, 0, 0});
    Assertions.assertEquals(2, res);
  }

  @Test
  void test5() {
    int res = target.maxDistToClosest(new int[]{1, 0, 0, 0});
    Assertions.assertEquals(3, res);
  }

  @Test
  void test6() {
    int res = target.maxDistToClosest(new int[]{0, 1});
    Assertions.assertEquals(1, res);
  }

  @Test
  void test7() {
    int res = target.maxDistToClosest(new int[]{1, 0, 0, 1});
    Assertions.assertEquals(1, res);
  }
}