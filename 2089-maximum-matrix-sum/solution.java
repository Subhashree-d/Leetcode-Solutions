class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long totalsum=0;
        int minabsval=Integer.MAX_VALUE;
        int nc=0;
        for(int[] row:matrix){
            for(int val:row){
                totalsum+=Math.abs(val);
                if(val<0){nc++;}
            
            minabsval=Math.min(minabsval,Math.abs(val));
        }}
        if(nc%2!=0){totalsum-=2*minabsval;}
        return totalsum;
        
    }
}
