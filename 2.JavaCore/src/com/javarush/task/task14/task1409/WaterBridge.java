package com.javarush.task.task14.task1409;

public class WaterBridge implements Bridge {
    public static int count = 5;

    @Override
    public int getCarsCount() {
        return count;
    }
}
