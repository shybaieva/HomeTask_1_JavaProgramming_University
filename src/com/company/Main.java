package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("1. Fill matrix with random numbers\n" +
                "2. Fill array from A to B with the Step");
        int answer;
        do {
            answer = s.nextInt();
    }while (answer < 1 || answer > 2);

        switch (answer){
            case 1:{
                System.out.println("Enter n");
                int n = s.nextInt();

                System.out.println("Enter m");
                int m = s.nextInt();

               Matrix matrix = new Matrix(n, m);

                for(int i = 0; i<n; i++){
                    for(int j =0; j<m; j++){
                        matrix.matrix[i][j] = rnd.nextInt(9);
                    }
                }

                matrix.printArray();

                System.out.println("Result:");

                for(int i = 0; i<n; i++) {
                    for (int j = 0; j < m; j++) {
                        if(i == j && matrix.matrix[i][j]%2==0 && matrix.matrix[i][j]!=0){
                            System.out.printf(matrix.matrix[i][j]+ " ");
                        }
                    }
                }
                break;
            }
            case 2:{
                System.out.println("Enter A");
                int a = s.nextInt();
                System.out.println("Enter B");
                int b = s.nextInt();
                System.out.println("Enter Step");
                int step = s.nextInt();

                int length = 1+ (b-a)/step ;

               Array arr = new Array(a, b, step, length);

                for(int i=0; i<length; i++){
                    System.out.printf(arr.arr[i]+ " ");
                }
                break;
            }
        }
    }




}
