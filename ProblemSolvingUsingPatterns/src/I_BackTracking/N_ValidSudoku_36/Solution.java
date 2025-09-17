package I_BackTracking.N_ValidSudoku_36;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][10];
        boolean[][] cols = new boolean[9][10];
        boolean[][] boxes = new boolean[9][10];
        return validate(board, 0, rows, cols, boxes);
    }

    private boolean validate(char[][] board, int pos,
                             boolean[][] rows, boolean[][] cols, boolean[][] boxes) {
        if (pos == 81) return true;

        int r = pos / 9;
        int c = pos % 9;
        char ch = board[r][c];

        if (ch == '.') {
            // skip empty cell
            return validate(board, pos + 1, rows, cols, boxes);
        } else {
            int num = ch - '0'; // 1..9
            int boxIndex = (r / 3) * 3 + (c / 3);

            // if already seen in row/col/box -> invalid
            if (rows[r][num] || cols[c][num] || boxes[boxIndex][num]) {
                return false;
            }

            // place (mark)
            rows[r][num] = cols[c][num] = boxes[boxIndex][num] = true;

            // recurse to next cell
            boolean ok = validate(board, pos + 1, rows, cols, boxes);

            // backtrack (unmark) before returning
            rows[r][num] = cols[c][num] = boxes[boxIndex][num] = false;

            return ok;
        }
    }
}
