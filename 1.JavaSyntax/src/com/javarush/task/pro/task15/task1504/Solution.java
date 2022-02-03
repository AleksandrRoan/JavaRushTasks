package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             InputStream is = Files.newInputStream(Paths.get(scanner.nextLine()));
             OutputStream os = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            byte[] buffer = is.readAllBytes();
            byte[] newBuffer = new byte[buffer.length];
            for (int i = 0; i < buffer.length; i += 2) {
                if (i < buffer.length - 1) {
                    newBuffer[i] = buffer[i + 1];
                    newBuffer[i + 1] = buffer[i];
                } else {
                    newBuffer[i] = buffer[i];
                }
            }
            os.write(newBuffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

