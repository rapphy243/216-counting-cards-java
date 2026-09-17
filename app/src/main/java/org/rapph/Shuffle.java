package org.rapph;

public class Shuffle {
  public static int[] copyShuffle(int[] array) {
    int[] shuffledArray = new int[array.length];
    boolean[] isUsed = new boolean[array.length]; // To store if a element in the original array has been used or not

    int n = 0;
    while (n < array.length) {

      int rand = (int) (Math.random() * array.length);

      if (!isUsed[rand]) {
        shuffledArray[n] = array[rand];
        isUsed[rand] = true;
        n++;
      }
    }

    return shuffledArray;
  }

  public static int[] optimizedCopyShuffle(int[] array) {
    int[] shuffledArray = new int[array.length];

    int n = 0;
    while (n < array.length) {
      int rand = (int) (Math.random() * (array.length - n));
      shuffledArray[n] = array[rand];
      array[rand] = array[array.length - n - 1];
      n++;
    }
    return shuffledArray;
  }
  
  public static int[] inPlaceShuffle(int[] array) {
    int n = array.length;

    while (n > 0) {
      int rand = (int) (Math.random() * n);
      n--;

      int temp = array[n];
      array[n] = array[rand];
      array[rand] = temp;
    }
    return array;
  }
}
