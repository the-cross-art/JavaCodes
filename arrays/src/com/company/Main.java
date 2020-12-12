package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);

    }

    public static int[] getIntegers(int number){
        int[] array = new int[number];
        System.out.println("Enter" + number + " integers Value:\r");
        for(int i=0; i<array.length; i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length;i++){
            System.out.println("Value of Array at positions" + i + " is :" + array[i] );
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortArrays = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortArrays[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortArrays.length - 1; i++) {
                if (sortArrays[i] < sortArrays[i + 1]) {
                    temp = sortArrays[i];
                    sortArrays[i] = sortArrays[i + 1];
                    sortArrays[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortArrays;
    }

}
