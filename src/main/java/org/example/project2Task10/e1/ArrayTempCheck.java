package org.example.project2Task10.e1;

public class ArrayTempCheck {
    public static void main(String[] args) {
        int [] temperatures = {69, 60, 75, 71, 79, 61, 65};
        int highestTemp = temperatures[0];
        int lowestTemp = temperatures[0];

        for(int i = 1; i < temperatures.length; i++ ){
            if(temperatures[i] > highestTemp){
                highestTemp = temperatures[i];{
                }
                if(temperatures[i] < lowestTemp){
                    lowestTemp = temperatures[i];
                }

            }
        }
        System.out.println("Highest temperature for the week is "+highestTemp);
        System.out.println("Lowest temperature for this week is "+lowestTemp);
    }
}
