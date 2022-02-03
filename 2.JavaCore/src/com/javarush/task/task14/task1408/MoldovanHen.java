package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        int eggs = 10;
        return eggs;
    }

    @Override
    String getDescription() {
        String text = String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.MOLDOVA, getCountOfEggsPerMonth());
        return super.getDescription() + text;
    }
}
