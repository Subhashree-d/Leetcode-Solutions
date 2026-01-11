class Solution {
    public int maximumCount(int[] nums) {
        int pc=0;
        int nc=0;
        int r=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)pc++;
            else if(nums[i]<0)nc++;
        }
            if(pc>nc)r= pc;
            else if(pc<nc)r= nc;
            else if(pc==nc)r=pc;
            return r;
        
    }
}
