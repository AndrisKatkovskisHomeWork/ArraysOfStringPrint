package com.company;

import java.util.Arrays;

public class twoDimensionArray {

    public static void twoDimensionArray(String[] args) {


        int[][] twoDimensionArray = {
                {9, 5, 1},
                {8, 5, 2},
                {10, 88, 6, 5}
        };


//        for (int row = 0; row < twoDimensionArray.length; row++) {
//            for (int coll = 0; coll < twoDimensionArray[row].length; coll ++) {
//                System.out.print(twoDimensionArray[row][coll] + "\t");
//            }
//            System.out.println();
//        }

        System.out.println(Arrays.deepToString(twoDimensionArray));
    }
}