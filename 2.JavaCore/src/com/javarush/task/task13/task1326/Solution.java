package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileInputStream fis = new FileInputStream(sc.nextLine());
        BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
        String line;
        List<Integer> list = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            int i = Integer.parseInt(line);
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        Collections.sort(list);
        for (int i : list) {
            System.out.println(i);
        }
        fis.close();
    }
}
