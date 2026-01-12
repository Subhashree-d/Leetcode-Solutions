class Solution {
    public int minMoves(int[] nums) {
        int m=nums[0];
        int ans=0;
        for(int i=1;i<nums.length;i++)m=Math.max(m,nums[i]);
        for(int i=0;i<nums.length;i++)ans+=m-nums[i];
        return ans;
        
    }
}
