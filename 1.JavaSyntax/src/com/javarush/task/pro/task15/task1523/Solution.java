package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        try (OutputStream output = connection.getOutputStream()) {
            output.write(12);
        }
        try (InputStream input = connection.getInputStream()) {
            byte[] data = input.readAllBytes();
            String str = new String(data);
            System.out.println(str);
        }
    }
}

