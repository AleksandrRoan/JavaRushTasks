package com.javarush.task.pro.task09.task0906;

import javax.swing.*;
import java.beans.BeanInfo;
import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber > 0) {
            String binaryNumber = "";
            int i = 0;
            while (decimalNumber != 0) {
                binaryNumber = Integer.toString(decimalNumber % 2) + binaryNumber;
                decimalNumber = decimalNumber / 2;
                i++;
            }
            return binaryNumber;
        } else {
            return "";
        }
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.equals("")) {
            return 0;
        } else {
            double decimalNumber = 0;
            for (int i = 0; i < binaryNumber.length(); i++) {
                decimalNumber = decimalNumber + (Character.getNumericValue(binaryNumber.charAt(binaryNumber.length()-1-i)) * Math.pow(2, i));
            }
            return (int) decimalNumber;
        }
    }
}
