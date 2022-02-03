package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(text));
        String s;
        while (true) {
            s = reader.readLine();
            if (s.equals("exit")) {
                writer.write(s + "\n");
                break;
            } else {
                writer.write(s + "\n");
            }
        }
        reader.close();
        writer.close();
    }
}
