class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] row : A) {
            for (int i = 0; i < (A[0].length + 1) / 2; i++) {
                int tmp = row[i] ^ 1;
                row[i] = row[A[0].length - 1 - i] ^ 1;
                row[A[0].length - 1 - i] = tmp;
            }
        }
        return A;
    }
}