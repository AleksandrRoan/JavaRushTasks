package com.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        do {
            String s = sc.nextLine();
            boolean b1 = Files.isDirectory(Path.of(s));
            boolean b2 = Files.isRegularFile(Path.of(s));
            if (b1 || b2) {
                if (Files.isDirectory(Path.of(s))) {
                    System.out.println(s + THIS_IS_DIR);
                } else if (Files.isRegularFile(Path.of(s))) {
                    System.out.println(s + THIS_IS_FILE);
                }
            } else {
                b = false;
            }
        }
        while (b);
    }
}

