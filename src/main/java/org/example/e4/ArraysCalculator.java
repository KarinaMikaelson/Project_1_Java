package org.example.e4;

public class ArraysCalculator {
    public static void main(String[] args) {

        int [][] array2D = {
                {2, 4, 3, 7},
                {5, 9, 2, 4},
                {8, 6, 7, 9}
        };
        int evenSum = 0;
        int oddSum = 0;

        for(int[] row : array2D){
            for(int num:row){
                if( num % 2 == 0){
                    evenSum = evenSum + num;
                }else{
                    oddSum = oddSum + num;
                }
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
