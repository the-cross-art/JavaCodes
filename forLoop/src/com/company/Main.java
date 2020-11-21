package com.company;



import java.security.PublicKey;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumOdd(13, 13));
    }
    public static boolean isOdd(int number){

        if (number>0 && (number%2 !=0)){
                return true;
        }
        return false;
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if(start>0 && end >0 && start<=end){
            for(int i=start; i<= end;i++){
                if(isOdd(i)){
                    sum = sum + i;
                }
            }
            return sum;
        }
        return -1;
    }
}
