class Solution {
    public boolean isValidSudoku(char[][] board) {
    for(int i=0; i<=8; i++) {
        for(int j=0; j<=8; j++) {
            if(!isValid(board, 0, j, 8, j) || !isValid(board, i, 0, i, 8)) return false;
            if(i%3==0 && j%3==0 && !isValid(board, i, j, i+2, j+2)) return false;
        }
    }
    return true;
}
private boolean isValid(char[][] board, int starti, int startj, int endi, int endj) {
    int[] digits = new int[9];
    for(int i=starti; i<=endi; i++) {
        for(int j=startj; j<=endj; j++) {
            if(board[i][j]!='.' && ++digits[board[i][j]-'1']>1) return false;
        }
    }
    return true;
}
}