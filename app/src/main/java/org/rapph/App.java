package org.rapph;

public class App {
    public static void main(String[] args) {
      int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      int shuffledArray[] = Shuffle.copyShuffle(array);

      System.out.println("Original array: ");
      for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();

      System.out.println("Shuffled array: ");
      for (int i = 0; i < shuffledArray.length; i++) {
        System.out.print(shuffledArray[i] + " ");
      }
      System.out.println();

      shuffledArray = Shuffle.optimizedCopyShuffle(shuffledArray);

      System.out.println("Shuffled again: ");
      for (int i = 0; i < shuffledArray.length; i++) {
        System.out.print(shuffledArray[i] + " ");
      }
      System.out.println();

      Shuffle.inPlaceShuffle(shuffledArray);

      System.out.println("Shuffled again: ");
      for (int i = 0; i < shuffledArray.length; i++) {
        System.out.print(shuffledArray[i] + " ");
      }
      System.out.println();
    }
}
