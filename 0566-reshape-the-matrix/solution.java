class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c != mat.length*mat[0].length){
            return mat;
        }
        if(r == mat.length && c == mat[0].length){
            return mat;
        }
        int[][] arr = new int[1][r*c];
        int count = 0;
        for(int row = 0; row < mat.length ; row++){
            for(int col = 0; col < mat[0].length; col++){
                arr[0][count] = mat[row][col];
                count++;
            }
        }
        int[][] ans = new int[r][c];
        count = 0;
        for(int row = 0; row < r; row++){
            for(int col = 0; col < c; col++){
                ans[row][col] = arr[0][count];

                count++;
            }
        }
        return ans;
    }
}
