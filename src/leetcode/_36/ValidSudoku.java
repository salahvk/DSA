package leetcode._36;

import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] sudoku = {
                { '1', '2', '.', '.', '3', '.', '.', '.', '.' },
                { '4', '3', '.', '5', '.', '.', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '.', '3' },
                { '5', '.', '.', '.', '6', '.', '.', '.', '4' },
                { '.', '.', '.', '8', '.', '3', '.', '.', '5' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '.', '.', '.', '.', '.', '2', '.', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '8' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        System.out.println(isValidSudoku(sudoku));
    }

    // my method
    public static boolean isValidSudoku(char[][] board) {
        HashSet<Character> rowHashSet = new HashSet<>();
        HashSet<Character> columnHashSet = new HashSet<>();
        HashMap<String, HashSet<Character>> hashMap = new HashMap<>();
        // check rows
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ((!rowHashSet.add(board[i][j]) && board[i][j] != '.')
                        || !columnHashSet.add(board[j][i]) && board[j][i] != '.') {
                    return false;
                }
                if (hashMap.containsKey(String.valueOf((i / 3) + "," + (j / 3)))) {
                    HashSet<Character> set = hashMap.get(String.valueOf((i / 3) + "," + (j / 3)));
                    Boolean isValueAdded = set.add(board[i][j]);
                    if (!isValueAdded && board[i][j] != '.') {
                        return false;
                    }
                } else {
                    HashSet<Character> set = new HashSet<>();
                    set.add(board[i][j]);
                    hashMap.put(String.valueOf((i / 3) + "," + (j / 3)), set);
                }
                rowHashSet.add(board[i][j]);
                columnHashSet.add(board[j][i]);
            }
            rowHashSet.clear();
            columnHashSet.clear();
        }

        return true;
    }

    // there is also more simpler method which used by neetcode
}
