package org.example.e2;

public class ArraysSum {
    public static void main(String[] args) {

        int [] array = {2, 8, 13, 24, 11, 19, 21};
        int sum = 0;
        for(int num:array){
            sum = sum + num;
        }
        System.out.println("The sum af stored values is "+sum);
    }
}
