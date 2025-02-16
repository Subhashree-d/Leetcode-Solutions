class Solution {
    public int rob(int[] nums) {
        if(nums.length==0)return 0;
        if(nums.length==1)return nums[0];

        int pre2=0;
        int pre1=0;
        for(int num:nums)
        {
            int current=Math.max(pre1,pre2+num);
            pre2=pre1;
            pre1=current;
        }
        return pre1;
    }
}
