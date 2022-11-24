class Solution {
    public boolean exist(char[][] board, String word) {
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {
                if(board[row][col] == word.charAt(0) && search(board, row, col, 0, word))
                    return true;
            }
        }
        return false;
    }
    
    public boolean search(char[][] board, int row, int col, int index, String word) {
        if(index == word.length())
            return true;
        
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(index))
            return false;
        
        char current = board[row][col];
        board[row][col] = '-';
        boolean found = search(board, row + 1, col, index+1, word) ||
                        search(board, row, col + 1, index+1, word) ||
                        search(board, row - 1, col, index+1, word) ||
                        search(board, row, col - 1, index+1, word);
        
        board[row][col] = current;
        
        return found;
    }
}