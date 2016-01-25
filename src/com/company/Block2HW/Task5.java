package com.company.Block2HW;

/**
 * Created by balabushko on 25.01.16.
 */
public class Task5 {

    //Посчитать количество элементов равных заданному
    public static int getIndexElementValue(int[] array, int value) {
        int count = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            if (value == array[i]) {
                count += 1;
            }
        }
        return count;
    }
}
