package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        int eggs = 20;
        return eggs;
    }

    @Override
    String getDescription() {
        String text = String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.BELARUS, getCountOfEggsPerMonth());
        return super.getDescription() + text;
    }
}
