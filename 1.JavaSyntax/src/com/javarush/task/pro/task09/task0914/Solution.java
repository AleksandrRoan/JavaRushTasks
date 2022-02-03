package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        String str1 = path.substring(0,path.indexOf("jdk"));
        String str2 = path.substring(path.indexOf("/bin"));
        return str1 + jdk + str2;
    }
}
