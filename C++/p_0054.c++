class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> result;
        
        int n = matrix.size();        // number of rows
        int m = matrix[0].size();     // number of columns

        int startRow = 0, endRow = n - 1;
        int startCol = 0, endCol = m - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Traverse the first row from left to right
            for (int j = startCol; j <= endCol; ++j) {
                result.push_back(matrix[startRow][j]);
            }
            ++startRow;

            // Traverse the last column from top to bottom
            for (int i = startRow; i <= endRow; ++i) {
                result.push_back(matrix[i][endCol]);
            }
            --endCol;

            // Traverse the last row from right to left
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; --j) {
                    result.push_back(matrix[endRow][j]);
                }
                --endRow;
            }

            // Traverse the first column from bottom to top
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; --i) {
                    result.push_back(matrix[i][startCol]);
                }
                ++startCol;
            }
        }

        return result;
    }
};
