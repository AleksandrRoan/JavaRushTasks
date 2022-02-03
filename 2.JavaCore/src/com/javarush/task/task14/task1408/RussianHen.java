package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        int eggs = 2;
        return eggs;
    }

    @Override
    String getDescription() {
        String text = String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.RUSSIA, getCountOfEggsPerMonth());
        return super.getDescription() + text;
    }
}
