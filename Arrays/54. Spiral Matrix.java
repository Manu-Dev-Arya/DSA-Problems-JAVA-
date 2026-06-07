class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int sRow = 0;
        int eRow = matrix.length - 1;
        int sCol = 0;
        int eCol = matrix[0].length - 1;

        List<Integer> list = new ArrayList<>();

        while (sRow <= eRow && sCol <= eCol) {
            for (int j = sCol; j <= eCol; j++) {
                list.add(matrix[sRow][j]);
            }
            sRow++;
            for (int i = sRow; i <= eRow; i++) {
                list.add(matrix[i][eCol]);
            }
            eCol--;
            if (sRow <= eRow) {
                for (int j = eCol; j >= sCol; j--) {
                    list.add(matrix[eRow][j]);
                }
                eRow--;
            }
            if (sCol <= eCol) {
                for (int i = eRow; i >= sRow; i--) {
                    list.add(matrix[i][sCol]);
                }
                sCol++;
            }
        }
        return list;
    }
}