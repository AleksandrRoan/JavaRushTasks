package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Иван Иванов",3.5);
        grades.put("Иван Сергеев",2.9);
        grades.put("Андрей Петров",4.8);
        grades.put("Дмитрий Гаврилов",3.7);
        grades.put("Дарья Марина",4.1);
    }
}
