package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            if (n % 2 == 1) {
                for (int j = 0; j < n; j++) {
                    System.out.println(array[j]);
                }
            } else {
                for (int j = 0; j < n; j++) {
                    System.out.println(array[n - j - 1]);
                }
            }
        }
    }
}
