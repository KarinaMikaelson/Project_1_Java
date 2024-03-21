package org.example.project2Task10.e7;

public class FibonacciSeries {
    public static void main(String[] args) {

        int n = 10;
        int firstNum = 0;
        int secondNum = 1;
        System.out.println("First "+ n +" numbers of Fibonacci series");

        for(int i = 1; i <= n; i++){
            System.out.print(firstNum +" ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
        /*
        The Fibonacci series is a series of elements where, the previous
        two elements are added to get the next element, starting with 0 and 1
         */
    }
}
