class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] array = new int[matrix.length * matrix[0].length];
        int index = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }
    Arrays.sort(array);
        return array[k-1];

    }
}