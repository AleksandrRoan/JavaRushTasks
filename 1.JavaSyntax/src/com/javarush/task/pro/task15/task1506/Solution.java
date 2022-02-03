package com.javarush.task.pro.task15.task1506;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            List<String> list = Files.readAllLines(Paths.get(sc.next()));
            for(String s : list) {
                char[] listToChar = s.toCharArray();
                for (Character character : listToChar) {
                    if (character != ' ' && character != '.' && character != ',') {
                        System.out.print(character);
                    }
                }
            }
        } catch (Exception e){
            System.out.println("Something went wrong : " + e);
        }
    }
}

