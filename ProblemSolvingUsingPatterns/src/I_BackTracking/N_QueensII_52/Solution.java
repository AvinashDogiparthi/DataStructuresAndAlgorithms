package I_BackTracking.N_QueensII_52;

class Solution {

    public static void main(String[] args) {
        int count = totalNQueens(9);
        System.out.println(count);
    }
    public static int totalNQueens(int n) {
       boolean[][] booleanArray = new boolean[n][n];
       return countPossibilityOfPlacingQueens(booleanArray,0);
    }

    public static int countPossibilityOfPlacingQueens(boolean[][] board, int row){

        if(row == board.length){
            return 1;
        }

        int count = 0;

        for(int col = 0;col < board.length;col++){

            if(isSafe(board,row,col)){
                board[row][col] = true;
                count = count + countPossibilityOfPlacingQueens(board,row+1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // vertical check
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }

        // left diagonal
        for (int i = 1; row - i >= 0 && col - i >= 0; i++) {
            if (board[row - i][col - i]) return false;
        }

        // right diagonal
        for (int i = 1; row - i >= 0 && col + i < board.length; i++) {
            if (board[row - i][col + i]) return false;
        }

        return true;
    }
}