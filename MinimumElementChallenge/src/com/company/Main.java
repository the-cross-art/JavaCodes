package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = scanner.nextInt();
        scanner.nextLine();


        int[] myIntegers = readIntegers(number);
        int ans = findMin(myIntegers);
        System.out.println(ans);
    }

    public static int[] readIntegers(int number){
        int[] array = new int[number];
        for(int i=0; i<number; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<array.length;i++){
            if(array[i]< min){
                min=array[i];
            }
        }
        return min;
    }
}
