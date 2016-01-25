package com.company.Block2HW;

/**
 * Created by balabushko on 25.01.16.
 */
public class Task1 {

    //Найти сумму элементов массива
    public static int getSumElements(int arr[]){
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
}
