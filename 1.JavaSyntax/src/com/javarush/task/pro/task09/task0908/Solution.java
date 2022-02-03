package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.equals("")) {
            return "";
        } else if (!binaryNumber.matches("[01]+")) {
            return "";
        } else {
            String hexNumber = "";
            if (binaryNumber.length() % 4 != 0) {
                binaryNumber = "0".repeat(4 - (binaryNumber.length() % 4)) + binaryNumber;
            }
            for (int i = 0; i < binaryNumber.length(); i = i + 4) {
                String index = binaryNumber.substring(i, i + 4);
                switch (index) {
                    case "0000":
                        hexNumber = hexNumber + "0";
                        break;
                    case "0001":
                        hexNumber = hexNumber + "1";
                        break;
                    case "0010":
                        hexNumber = hexNumber + "2";
                        break;
                    case "0011":
                        hexNumber = hexNumber + "3";
                        break;
                    case "0100":
                        hexNumber = hexNumber + "4";
                        break;
                    case "0101":
                        hexNumber = hexNumber + "5";
                        break;
                    case "0110":
                        hexNumber = hexNumber + "6";
                        break;
                    case "0111":
                        hexNumber = hexNumber + "7";
                        break;
                    case "1000":
                        hexNumber = hexNumber + "8";
                        break;
                    case "1001":
                        hexNumber = hexNumber + "9";
                        break;
                    case "1010":
                        hexNumber = hexNumber + "a";
                        break;
                    case "1011":
                        hexNumber = hexNumber + "b";
                        break;
                    case "1100":
                        hexNumber = hexNumber + "c";
                        break;
                    case "1101":
                        hexNumber = hexNumber + "d";
                        break;
                    case "1110":
                        hexNumber = hexNumber + "e";
                        break;
                    case "1111":
                        hexNumber = hexNumber + "f";
                        break;
                }
            }
            return hexNumber;
        }
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null || hexNumber.equals("")) {
            return "";
        } else if (!hexNumber.matches("[0123456789abcdef]+")) {
            return "";
        } else {
            String binaryNumber = "";
            for (int i = 0; i < hexNumber.length(); i++) {
                switch (hexNumber.charAt(i)) {
                    case '0':
                        binaryNumber = binaryNumber + "0000";
                        break;
                    case '1':
                        binaryNumber = binaryNumber + "0001";
                        break;
                    case '2':
                        binaryNumber = binaryNumber + "0010";
                        break;
                    case '3':
                        binaryNumber = binaryNumber + "0011";
                        break;
                    case '4':
                        binaryNumber = binaryNumber + "0100";
                        break;
                    case '5':
                        binaryNumber = binaryNumber + "0101";
                        break;
                    case '6':
                        binaryNumber = binaryNumber + "0110";
                        break;
                    case '7':
                        binaryNumber = binaryNumber + "0111";
                        break;
                    case '8':
                        binaryNumber = binaryNumber + "1000";
                        break;
                    case '9':
                        binaryNumber = binaryNumber + "1001";
                        break;
                    case 'a':
                        binaryNumber = binaryNumber + "1010";
                        break;
                    case 'b':
                        binaryNumber = binaryNumber + "1011";
                        break;
                    case 'c':
                        binaryNumber = binaryNumber + "1100";
                        break;
                    case 'd':
                        binaryNumber = binaryNumber + "1101";
                        break;
                    case 'e':
                        binaryNumber = binaryNumber + "1110";
                        break;
                    case 'f':
                        binaryNumber = binaryNumber + "1111";
                        break;
                }
            }
            return binaryNumber;
        }
    }
}
