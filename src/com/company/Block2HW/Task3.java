package com.company.Block2HW;

/**
 * Created by balabushko on 25.01.16.
 */
public class Task3 {

    //Найти минимальный элемент, значение и индекс
    public static int getMinElement(int arr[]){
        int minIndex = 0;
        int arrMax = arr[0];
        for (int i = 0; i > arr.length; i++)
        {
            if(arr[i] < arrMax)
            {
                arrMax = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
