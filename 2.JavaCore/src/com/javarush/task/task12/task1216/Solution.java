package com.javarush.task.task12.task1216;

/* 
Летать охота
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public static String getFly() {
            return "I'm  flying";
        }

        public abstract int countFly();
    }

}
