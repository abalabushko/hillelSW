package com.company.Block2HW;

/**
 * Created by balabushko on 25.01.16.
 */
public class Task4 {

    //Найти среднее значение элементов массива
    public static double getAverage(int arr[]) {
        double average = 0;
        if (arr.length > 0) {

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            average = sum / arr.length;
        }return average;
    }
}
