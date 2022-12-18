package com.nevisende.ms;

import java.util.Scanner;

public class MineSweeperGame {
    MineMatrix mineFieldMatrix;
    MineMatrix screenFieldMatrix;
    int rowNumber;
    int columnNumber;
    Scanner input = new Scanner(System.in);


    MineSweeperGame(){
        rowNumber = getIntAnswer("Please enter any row number to create: ");
        columnNumber = getIntAnswer("Please enter any column number to create: ");

        mineFieldMatrix = new MineMatrix(rowNumber, columnNumber).create();
        screenFieldMatrix = new MineMatrix(rowNumber,columnNumber).createEmptyField();
    }

    public void play(){
        boolean isWin = false;
        boolean isExploded = false;
        int openedFieldNumber = 0;
        while (!isWin && !isExploded){
            screenFieldMatrix.printMatrix();
            int checkRowNumber = getIntAnswer("Please enter row number you want to see: ") - 1;
            int checkColumnNumber = getIntAnswer("Please enter column number you want to see: ") - 1;

            if(checkRowNumber >= this.rowNumber || checkRowNumber < 0 || checkColumnNumber >= this.columnNumber || checkColumnNumber < 0){
                System.out.println("Please enter valid numbers");
                continue;
            }

            String hiddenValue = mineFieldMatrix.getFieldValue(checkRowNumber,checkColumnNumber);

            if (mineFieldMatrix.getFieldValue(checkRowNumber,checkColumnNumber).equals("*")) {
                isExploded = true;
                mineFieldMatrix.printMatrix();
            } else{
                screenFieldMatrix.setFieldValue(checkRowNumber, checkColumnNumber, hiddenValue);
                openedFieldNumber++;
            }

            if(openedFieldNumber == mineFieldMatrix.getNumberFieldsWithoutMines()) isWin = true;
        }

        if(isWin) System.out.println("Congratulations: YOU WIN!");
        else System.out.println("Maybe next time :)");
    }

    private int getIntAnswer(String question){
        System.out.print(question);
        return input.nextInt();
    }
}
