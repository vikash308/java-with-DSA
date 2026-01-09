public class nQueens {
    static boolean isSet(char[][] board, int row, int col){
        for(int i=row; i>=0; i--){
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for(int i=row, j=col; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i=row, j=col; i>=0 && j<board.length; i-- , j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    static void setQueens(char[][] board, int row){
        if(row == board.length){
            printBoard(board);
            return;
        }

        for(int i=0; i<board.length; i++){
            if(isSet(board, row, i)){
                board[row][i] = 'Q';
                setQueens(board, row + 1);
                board[row][i] = 'x';
            }
        }
    }

    static void printBoard(char[][] board){
        System.out.println("----------board----------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        char board[][] = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'x';
            }
        }
        setQueens(board, 0);
    }
}
