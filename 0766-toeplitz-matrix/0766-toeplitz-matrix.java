public class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int a = matrix[i][j];
                int k = i, l = j;
                while (k < matrix.length && l < matrix[0].length) {
                    if (matrix[k][l] != a) return false;
                    k++;
                    l++;
                }
            }
        }
        return true;
    }
}