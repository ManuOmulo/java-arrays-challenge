package manu.omulo;

import java.util.Arrays;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    int[] randomArray = getRandomArray(10);
    System.out.println(Arrays.toString(randomArray));

    Arrays.sort(randomArray);
    System.out.println(Arrays.toString(randomArray));
  }

  private static int[] getRandomArray(int length) {
    Random random = new Random();
    int[] newInt = new int[length];

    for (int i = 0; i < length; i++) {
      newInt[i] = random.nextInt(100);
    }

    return newInt;
  }
}
