package dsa_everything.graph;

import java.util.ArrayList;

public class RiverSIze {

    public static void main(String[] args) {
        int[][] matrix = { { 1, 0, 0, 1, 1 }, { 0, 1, 1, 1, 0 }, { 0, 0, 0, 0, 1 }, { 1, 0, 0, 0, 1 }, };
        // list all sizes of river
        // 1 is river and 0 is land
    }

    static void listSizeOfRivers(int[][] matrix) {
        boolean[][] isChecked = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (isChecked[i][j]) {
                    continue;
                }
                // searchEachLiverLength(i, j, j);
            }
        }
    }

    static void searchEachRiverLength(int i, int j, int[][] matrix, boolean[][] isChecked) {
        int riverLength = 0;
        if (!isChecked[i][j]) {
            if (matrix[i][j] != 0) {
                riverLength++;
            }
        }
    }

    static void checkNearestNodes() {

    }
}
