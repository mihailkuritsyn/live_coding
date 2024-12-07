package leetcode.hard.hash;

public class MaxPointsOnALine {

  public static void main(String[] args) {
    MaxPointsOnALine obj = new MaxPointsOnALine();
    int[][] points = new int[][]{{1, 1}, {2, 2}, {3, 2}, {3, 3}};
    int collinearCount = obj.maxPoints(points);
    System.out.printf("collinearCount = " + collinearCount);
  }

  public int maxPoints(int[][] points) {
    if (points.length < 3) {
      return points.length;
    }
    int[] p1 = points[0];
    int[] p2 = points[1];
    int[] p3 = points[2];
    int x1 = p1[0];
    int y1 = p1[1];
    int x2 = p2[0];
    int y2 = p2[1];
    int x3 = p3[0];
    int y3 = p3[1];
    boolean collinear = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2) == 0;

    if (points.length == 3) {
      return collinear ? 3 : 2;
    }

    int maxCollinear = 2;
    int currCollinear;
    for (int i = 0; i < points.length; i++) {
      for (int j = i + 1; j < points.length; j++) {
        currCollinear = 2;
//        System.out.println("[" + i + "][" + j + "]");
        for (int z = 0; z < points.length; z++) {
          if (z == i || z == j) {
            continue;
          }
//          System.out.println("(" + z + ")");

          p1 = points[i];
          p2 = points[j];
          p3 = points[z];
          x1 = p1[0];
          y1 = p1[1];
          x2 = p2[0];
          y2 = p2[1];
          x3 = p3[0];
          y3 = p3[1];
          collinear = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2) == 0;
          if (collinear) {
            currCollinear++;
          }
        }
        if (currCollinear > maxCollinear) {
          maxCollinear = currCollinear;
        }
      }
    }

    return maxCollinear;
  }
}
