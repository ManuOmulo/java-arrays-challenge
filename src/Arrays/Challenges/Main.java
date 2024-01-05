package Arrays.Challenges;

import java.util.Arrays;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    int[] myArray = getRandomArray(10);
    System.out.println(Arrays.toString(myArray));

    Arrays.sort(myArray);
    System.out.println(Arrays.toString(myArray));

    System.out.println(Arrays.toString(reverseArray(myArray)));
  }

  public static int[] getRandomArray(int length) {
    Random random = new Random();
    int[] newIntArray = new int[length];

    for (int i = 0; i < length; i++) {
      newIntArray[i] = random.nextInt(100);
    }

    return newIntArray;
  }

  public static int[] reverseArray(int[] array) {
    int[] newArray = Arrays.copyOf(array, array.length);

    for (int i = 0; i < newArray.length; i++) {
      for (int j = 1; j < newArray.length; j++) {
        if (j > i) {
          int temp = newArray[i];
          newArray[i] = newArray[j];
          newArray[j] = temp;
        }
      }
    }

    return newArray;
  }
}
