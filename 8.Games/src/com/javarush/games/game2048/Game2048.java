package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

import java.util.Collections;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame() {
        createNewNumber();
        createNewNumber();
    }

    private void drawScene() {
        for (int x = 0; x < gameField.length; x++) {
            for (int y = 0; y < gameField[x].length; y++) {
                setCellColoredNumber(x, y, 0);
            }
        }
    }

    private void createNewNumber() {
        int x = getRandomNumber(SIDE);
        int y = getRandomNumber(SIDE);
        if (gameField[x][y] == 0) {
            if (getRandomNumber(10) == 9) {
                gameField[x][y] = 4;
            } else {
                gameField[x][y] = 2;
            }
        } else {
            createNewNumber();
        }
    }

    private Color getColorByValue(int value) {
        switch (value) {
            case 2: return Color.LIGHTPINK;
            case 4: return Color.BLUEVIOLET;
            case 8: return Color.BLUE;
            case 16: return Color.CYAN;
            case 32: return Color.LIGHTSEAGREEN;
            case 64: return Color.LIMEGREEN;
            case 128: return Color.ORANGE;
            case 256: return Color.INDIANRED;
            case 512: return Color.RED;
            case 1024: return Color.MAGENTA;
            case 2048: return Color.MEDIUMVIOLETRED;
            default: return Color.WHITE;
        }
    }

    private void setCellColoredNumber(int x, int y, int value) {
        if(gameField[x][y] != 0){
            setCellValueEx(x, y, getColorByValue(value), Integer.toString(value));
        }
        else {
            setCellValueEx(x, y, getColorByValue(value), "");
        }
    }
}
