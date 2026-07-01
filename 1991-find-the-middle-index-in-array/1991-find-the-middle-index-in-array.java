class Solution {
    public int findMiddleIndex(int[] nums) {

        int ts=0;
        int ls=0;
        for(int i=0;i<nums.length;i++)ts+=nums[i];
        for(int i=0;i<nums.length;ls+=nums[i++])if(ls*2==ts-nums[i])return i;
        return -1;
        
    }
}