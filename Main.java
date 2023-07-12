package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new Random().ints(10, 0, 20).toArray();
        int number = 10;
        int testInterval = Math.abs(array[0] - number);
        int iNumber = 0;
        for (int i = 1; i < array.length; i++) {
            int interval = Math.abs(array[i] - number);
            if (interval <= testInterval) {
                if ((array[i] - number >= 0) || (interval != testInterval)) {
                    iNumber = i;
                    testInterval = interval;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array[iNumber]);
    }
}
