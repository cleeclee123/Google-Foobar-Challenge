public class Solution {
  public static int getGreatestSquare(int i) {
    int x = i;
    while (true) {
      int y = (x + i / x) / 2;
      if (y >= x) {
        return x * x;
      }
      x = y;
    }
  }

  public static int getArraySize(int i) {
    int count = 0;
    while (i > 0) {
      count += 1;
      int curr = getGreatestSquare(i);
      i -= curr;
    }
    return count;
  }

  public static int[] solution(int area) {
    int[] arr = new int[getArraySize(area)];
    int i = 0;
    while (area > 0 && i < arr.length) {
      int curr = getGreatestSquare(area);
      arr[i] = curr;
      i += 1;
      area -= curr;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] array = solution(12);
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }
}