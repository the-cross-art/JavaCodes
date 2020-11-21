package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the second number: ");
        int num2= scanner.nextInt();
        scanner.nextLine();
        if(num1>num2){
            System.out.println(num1 +" is greater than " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num2);
        }
        scanner.close();
    }
}
