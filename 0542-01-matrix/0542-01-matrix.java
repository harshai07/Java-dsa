class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] dist = new int[m][n];

        // First pass (top-left to bottom-right)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    dist[i][j] = 0;
                } else {
                    int top = i > 0 ? dist[i - 1][j] : 10000;
                    int left = j > 0 ? dist[i][j - 1] : 10000;
                    dist[i][j] = Math.min(top, left) + 1;
                }
            }
        }

        // Second pass (bottom-right to top-left)
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (mat[i][j] != 0) {
                    int bottom = i < m - 1 ? dist[i + 1][j] : 10000;
                    int right = j < n - 1 ? dist[i][j + 1] : 10000;
                    dist[i][j] = Math.min(dist[i][j], Math.min(bottom, right) + 1);
                }
            }
        }

        return dist;
    }
}
