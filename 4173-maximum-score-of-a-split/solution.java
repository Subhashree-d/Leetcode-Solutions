class Solution {
    public long maximumScore(int[] nums) {
       int n=nums.length;
        long[] suffixmin=new long[n];
        suffixmin[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffixmin[i]=Math.min(nums[i],suffixmin[i+1]);
        }
        long ps=0;
        long maxscore=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            ps+=nums[i];
            long score=ps-suffixmin[i+1];
            maxscore=Math.max(maxscore,score);
        }
        return maxscore;
    }
}
