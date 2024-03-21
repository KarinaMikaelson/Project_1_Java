package org.example.project2Task10.e8;

public class MaxMinArrays {
    public static void main(String[] args) {

        int [] numbers = {4, 2, 98, 12, 15, 18, 23};
        int max = numbers[0];
        int min = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("Maximum number in array is " + max);
        System.out.print("Minimum number in array is " + min);
    }
}
