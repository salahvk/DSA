package leetcode._79;

class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(m, n, board, word, 0, i, j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean dfs(int m, int n, char[][] board, String word, int index, int i, int j) {
        if (i >= m || i < 0 || j >= n || j < 0 || board[i][j] != word.charAt(index)) {
            return false;
        }
        if (index == word.length() - 1) {
            return true;
        }
        board[i][j] = '#';

        if (dfs(m, n, board, word, index + 1, i + 1, j) || dfs(m, n, board, word, index + 1, i - 1, j)
                || dfs(m, n, board, word, index + 1, i, j + 1) || dfs(m, n, board, word, index + 1, i, j - 1)) {
            return true;
        }

        board[i][j] = word.charAt(index);
        return false;
    }
}
