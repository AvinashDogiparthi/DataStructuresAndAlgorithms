package I_BackTracking.M_SudokuSolver_37;

class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        int n = board.length;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (board[row][col] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num;

                            if (solve(board)) {
                                return true;
                            } else {
                                // backtrack
                                board[row][col] = '.';
                            }
                        }
                    }
                    return false; // no valid number found, must backtrack
                }
            }
        }
        return true;
    }

    private boolean isSafe(char[][] board, int row, int col, char num) {
        int n = board.length;

        // check row
        for (int j = 0; j < n; j++) {
            if (board[row][j] == num) return false;
        }

        // check column
        for (int i = 0; i < n; i++) {
            if (board[i][col] == num) return false;
        }

        // check 3x3 sub-box
        int sqrt = (int) Math.sqrt(n);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) return false;
            }
        }

        return true;
    }
}
