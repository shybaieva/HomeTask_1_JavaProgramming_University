package com.company;

public class Matrix {
    int n, m;
    int [][]matrix;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.matrix = new int [n][m];
    }

    public void printArray(){
        for(int i = 0; i<n; i++){
            for(int j =0; j<m; j++){
                System.out.printf(matrix[i][j] + " ");
            }
            System.out.printf("\n");
        }
    }
}
