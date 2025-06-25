class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            dfs(i, 0, board, m, n);
            dfs(i, n - 1, board, m, n);
        }

        for (int j = 0; j < n; j++) {
            dfs(0, j, board, m, n);
            dfs(m - 1, j, board, m, n);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void dfs(int row, int col, char[][] board, int m, int n) {
        if (row < 0 || row >= m || col < 0 || col >= n || board[row][col] != 'O') return;
        board[row][col] = '.';
        dfs(row, col - 1, board, m, n);
        dfs(row - 1, col, board, m, n);
        dfs(row + 1, col, board, m, n);
        dfs(row, col + 1, board, m, n);
    }
}