class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int res[][] = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                
                int sum = 0;
                int count = 0;
                for(int p = -1; p <= 1; p++) {
                    for(int q = -1; q <= 1; q++) {
                        int nx = i + p;
                        int ny = j + q;
                        if(nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
                        sum += img[nx][ny];
                        count++;
                    }
                }
            res[i][j] = sum/count;
            }
        }
        return res;
    }
}
