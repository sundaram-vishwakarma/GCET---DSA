class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];

        int startRow = 0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = n-1;

        int val = 1;

        while (startRow<=endRow && startCol<=endCol) {
            /* first Row */
            for (int j=startCol; j<=endCol; j++) {
                matrix[startRow][j] = val++;
            }
            startRow += 1;

            /* end Col */
            for (int i=startRow; i<=endRow; i++) {
                matrix[i][endCol] = val++;
            }
            endCol -= 1;

            /* end Row */
            if (startRow <= endRow) {
                for (int j=endCol; j>=startCol; j--) {
                    matrix[endRow][j] = val++;
                }
                endRow -= 1;
            }

            /* first Col */
            if (startCol <= endCol) {
                for (int i=endRow; i>=startRow; i--) {
                    matrix[i][startCol] = val++;
                }
                startCol += 1;
            }
        }

        return matrix;
    }
}
