package com.javarush.task.task14.task1409;

public class SuspensionBridge implements Bridge {
    public static int count = 23;

    @Override
    public int getCarsCount() {
        return count;
    }
}
