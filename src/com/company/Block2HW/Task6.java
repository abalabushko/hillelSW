package com.company.Block2HW;

/**
 * Created by balabushko on 25.01.16.
 */
public class Task6 {

    //Посчитать количество элементов больше нуля
    public static int countElement(int[] array) {
        int count = 0;

        for(int i = 0;i < array.length;i++){
                if(array[i] > 0)
                    count++;
        }return count;
    }
}
