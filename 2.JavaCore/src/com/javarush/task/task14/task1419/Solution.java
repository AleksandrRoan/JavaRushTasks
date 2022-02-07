package com.javarush.task.task14.task1419;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] array = new int[3];
            array[4] = 1;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object o1 = null;
            Object o2 = new Object();
            System.out.println(o1.equals(o2));
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object ch = new Character('*');
            System.out.println((Byte)ch);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] nNegArray = new int[-5];
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String szShortString = "123";
            char chr = szShortString.charAt(10);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Integer aIntegerObj = new Integer("one");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Username\\Desktop\\test.txt"));
            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object array[] = new String[5];
            array[0] = 2;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            List<String> list = new ArrayList<>();
            list.add("One");
            list.add("Two");
            list.add("Three");
            for(String s : list) {
                list.remove(list.indexOf(s));
            }
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}
