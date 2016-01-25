package com.company.Block2HW;

/**
 * Created by balabushko on 25.01.16.
 */
public class Task2 {

    //Найти максимальный элемент, значение и индекс
    public static int getMaxElement(int arr[]){
        int maxIndex = 0;
        int arrMax = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > arrMax)
            {
                arrMax = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
