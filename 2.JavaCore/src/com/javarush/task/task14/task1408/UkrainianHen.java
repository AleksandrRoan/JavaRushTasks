package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        int eggs = 5;
        return eggs;
    }

    @Override
    String getDescription() {
        String text = String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.UKRAINE, getCountOfEggsPerMonth());
        return super.getDescription() + text;
    }
}
