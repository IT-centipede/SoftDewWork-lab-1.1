package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Постоєва К.О.\n");

        double[][] matrix = new double[7][7];
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = ((double) (Math.random() * 10));

                System.out.print(Math.round(matrix[i][j])+" ");
            }
            System.out.println();
        }
    }
}
