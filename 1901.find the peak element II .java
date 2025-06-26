public class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int leftCol = 0;
        int rightCol = cols - 1;

        while (leftCol <= rightCol) {
            int midCol = leftCol + (rightCol - leftCol) / 2;

            int maxRow = 0;
            for (int i = 0; i < rows; i++) {
                if (mat[i][midCol] > mat[maxRow][midCol]) {
                    maxRow = i;
                }
            }

            boolean isLeftSmaller = midCol == 0 || mat[maxRow][midCol] > mat[maxRow][midCol - 1];
            boolean isRightSmaller = midCol == cols - 1 || mat[maxRow][midCol] > mat[maxRow][midCol + 1];

            if (isLeftSmaller && isRightSmaller) {
                return new int[]{maxRow, midCol};
            } else if (!isLeftSmaller) {
                rightCol = midCol - 1;
            } else {
                leftCol = midCol + 1;
            }
        }

        return new int[]{-1, -1};
    }
}
