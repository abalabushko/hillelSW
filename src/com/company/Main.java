package com.company;

import com.company.Block2HW.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int array[] = {3,5,7,12,17,7,0};
        int value = array[5];

        int sum = Task1.getSumElements(array);
        int maxElemAndIndex = Task2.getMaxElement(array);
        int minElemAndIndex = Task3.getMinElement(array);
        double average = Task4.getAverage(array);
        int countValue = Task5.getIndexElementValue(array,value);
        int countElementsEqualsZero = Task6.countElementEqualZero(array);
        int countElements = Task7.countElement(array);

        System.out.println("Array sum " + sum);
        System.out.println("Max element and index " + maxElemAndIndex);
        System.out.println("Min element and index " + minElemAndIndex);
        System.out.println("Average " + average);
        System.out.println("Preset value " + countValue);
        System.out.println("count zero " + countElementsEqualsZero);
        System.out.println("count " + countElements);

    }
}
