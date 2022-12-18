package com.nevisende.ms;

import java.util.Random;

public class MineMatrix {
    private int  rowNumber;
    private int columnNumber;
    private String[][] mineFieldMatrix;
    private int mineLimitNumber;

    Random random = new Random();


    MineMatrix(int rowNumber, int columnNumber){
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.mineFieldMatrix = new String[rowNumber][columnNumber];
        this.mineLimitNumber = rowNumber * columnNumber / 4;

    }

    private void plowField() {
        int matrixRowNumber = mineFieldMatrix.length;
        int matrixColumnNumber = mineFieldMatrix[0].length;

        for (int rowIndex = 0; rowIndex < matrixRowNumber;  rowIndex++) {
            for (int columnIndex = 0; columnIndex < matrixColumnNumber; columnIndex++) {
                mineFieldMatrix[rowIndex][columnIndex] = "-";
            }
        }
    }
    private void mineDefense() {
        int minedFieldNumber = 0;

        while(minedFieldNumber < mineLimitNumber) {
            int randomRowIndex = random.nextInt(rowNumber);
            int randomColumnIndex = random.nextInt(columnNumber);

            if(this.mineFieldMatrix[randomRowIndex][randomColumnIndex].equals("*")) minedFieldNumber--;
            else this.mineFieldMatrix[randomRowIndex][randomColumnIndex] = "*";

            minedFieldNumber++;
        }
    }

    private void exposeNumbers(){
        int matrixRowNumber = this.mineFieldMatrix.length;
        int matrixColumnNumber = this.mineFieldMatrix[0].length;

        for (int rowIndex = 0; rowIndex < matrixRowNumber;  rowIndex++) {
            for (int columnIndex = 0; columnIndex < matrixColumnNumber; columnIndex++) {
                String currentField = this.mineFieldMatrix[rowIndex][columnIndex];

                if(currentField.equals("*")) continue;

                int numberOfMinedNeighbors = 0;
                int startSearchingRowIndex = (rowIndex == 0) ? 0 : rowIndex -1;
                int endSearchingRowIndex = (rowIndex == matrixRowNumber - 1) ? rowIndex : rowIndex + 1;
                int startSearchingColumnIndex = (columnIndex == 0) ? 0 : columnIndex -1;
                int endSearchingColumnIndex = (columnIndex == matrixColumnNumber -1) ? columnIndex : columnIndex + 1;

                for (int searchingRowIndex = startSearchingRowIndex; searchingRowIndex <= endSearchingRowIndex ; searchingRowIndex++) {
                    for (int searchingColumnIndex = startSearchingColumnIndex; searchingColumnIndex <= endSearchingColumnIndex; searchingColumnIndex++){
                        if(this.mineFieldMatrix[searchingRowIndex][searchingColumnIndex].equals("*")) numberOfMinedNeighbors++;
                    }
                }

                this.mineFieldMatrix[rowIndex][columnIndex] = String.valueOf(numberOfMinedNeighbors);
            }
        }

    }

    public void printMatrix(){
        int matrixRowNumber = mineFieldMatrix.length;
        int matrixColumnNumber = mineFieldMatrix[0].length;

        for (int rowIndex = 0; rowIndex < matrixRowNumber;  rowIndex++) {
            for (int columnIndex = 0; columnIndex < matrixColumnNumber; columnIndex++) {
                System.out.print(mineFieldMatrix[rowIndex][columnIndex] + " ");
            }
            System.out.println();
        }
    }


    MineMatrix create(){
        plowField();
        mineDefense();
        exposeNumbers();
        return this;
    }

    public MineMatrix createEmptyField(){
        MineMatrix mineMatrix = new MineMatrix(this.rowNumber, this.columnNumber);
        mineMatrix.plowField();
        return mineMatrix;
    }

    public String getFieldValue(int rowNumber, int columnNumber){
        return this.mineFieldMatrix[rowNumber][columnNumber];
    }

    public void setFieldValue(int rowNumber, int columnNumber, String value) {
        this.mineFieldMatrix[rowNumber][columnNumber] = value;
    }

    public int getNumberFieldsWithoutMines(){
        return this.rowNumber * this.columnNumber - this.mineLimitNumber;
    }
}
