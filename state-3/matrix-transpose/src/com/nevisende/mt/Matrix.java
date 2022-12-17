package com.nevisende.mt;

public class Matrix {
    int columnNumber;
    int rowNumber;
    int[][] matrixList;

    Matrix( int[][] arrayList) {
        this.rowNumber = arrayList.length;
        this.columnNumber = arrayList[0].length;
        this.matrixList = arrayList;
        System.out.println("Column Number = " + this.columnNumber );
        System.out.println("Row Number = " + this.rowNumber + "\n");

    }

    public Matrix getTranspose() {
        int[][] transposeMatrix = new int[this.columnNumber][this.rowNumber];
        for (int rowNumberOfMatrix = 0; rowNumberOfMatrix < this.rowNumber; rowNumberOfMatrix++){
            for (int columnNumberOfMatrix = 0; columnNumberOfMatrix < this.columnNumber; columnNumberOfMatrix++){
                transposeMatrix[columnNumberOfMatrix][rowNumberOfMatrix] = this.matrixList[rowNumberOfMatrix][columnNumberOfMatrix];
            }
        }
        return new Matrix(transposeMatrix);
    }

    public void printMatrix(){
        for (int rowIndex = 0; rowIndex < this.rowNumber; rowIndex++) {
            for (int elementRow : this.matrixList[rowIndex] ) {
                System.out.print(elementRow + " ");
            }
            System.out.println();
        }

    }
}
