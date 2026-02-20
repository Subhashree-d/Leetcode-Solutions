class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer>rowmin=new ArrayList<>();
        ArrayList<Integer>colmax=new ArrayList<>();
       
        
        
        for(int i=0;i<matrix.length;i++){
            int m=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<m){
                    m=matrix[i][j];
                }
            }
            rowmin.add(m);
        }
        for(int j=0;j<matrix[0].length;j++){
            int n=Integer.MIN_VALUE;
            for(int i=0;i<matrix.length;i++)
            {
                if(matrix[i][j]>n){
                    n=matrix[i][j];
                }
            }
            colmax.add(n);
        }
        ArrayList<Integer>re=new ArrayList<Integer>();
        for(int x:rowmin){
            for(int y:colmax){
                if(x==y){
                    re.add(x);
                }
            }
        }
        return re;
    }
}
