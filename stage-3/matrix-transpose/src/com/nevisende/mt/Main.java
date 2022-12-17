package com.nevisende.mt;

public class Main {
    public static void main(String[] args) {
        int[][] example = new int[][]{{1,2,3}, {4,5,6}};

        System.out.println("----------------- Örnek Matris -----------------------");

        Matrix matrix = new Matrix(example);
        matrix.printMatrix();

        System.out.println("---------- Örnek Matrisin Transpozu ------------------");

        Matrix transposeOfMatrix = matrix.getTranspose();
        transposeOfMatrix.printMatrix();
    }
}

