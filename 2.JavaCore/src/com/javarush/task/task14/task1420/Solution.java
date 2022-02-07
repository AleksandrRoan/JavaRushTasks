package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        for(int i = number1; i > 0; i--){
            if (number1 % i == 0){
                if(number2 % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
