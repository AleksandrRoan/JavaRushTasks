package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        while (a < 10) {
            int n = 0;
            if (a == 0 || a == 9) {
                System.out.print("Б");
                while (n < 18) {
                    System.out.print("Б");
                    n++;
                }
                System.out.print("Б");
            } else {
                System.out.print("Б");
                while (n < 18) {
                    System.out.print(" ");
                    n++;
                }
                System.out.print("Б");
            }
            System.out.println("");
            a++;
        }
    }
}