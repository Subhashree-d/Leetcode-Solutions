class Solution {
    public int[][] transpose(int[][] matrix) {
        int r=matrix.length,c=matrix[0].length;
        int t[][]=new int[c][r];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                t[j][i]=matrix[i][j];
            }
        }
        return t;
        
    }
}
