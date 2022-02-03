package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber <= 0) {
            return "";
        } else {
            String hexHumber = "";
            while (decimalNumber != 0) {
                int index = decimalNumber % 16;
                hexHumber = HEX.charAt(index) + hexHumber;
                decimalNumber = decimalNumber / 16;
            }
            return hexHumber;
        }
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == "" || hexNumber == null) {
            return 0;
        } else {
            int decimalNumber = 0;
            for (int i = 0; i < hexNumber.length(); i++) {
                decimalNumber = HEX.indexOf(hexNumber.charAt(i)) * (int) Math.pow(16,hexNumber.length()-1-i) + decimalNumber;
            }
            return decimalNumber;
        }
    }
}
