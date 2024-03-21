package org.example.project2Task10.e3;

public class Arrays2dEvenOdd {
    public static void main(String[] args) {

        int [][] array2D = {
                {4, 2, 9, 1},
                {5, 3, 6, 7},
                {2, 8, 3, 6}
        };

        for(int [] row:array2D){
            for(int num : row){
                if( num % 2 == 0){
                    System.out.print(num+" ");
                }
            }
        }
    }
}
