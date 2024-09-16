class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int range=n*(n+1)/2;
        int actualsum=0;
        for(int num:nums)
        {
            actualsum +=num;
        }
        return range-actualsum;
    }

}
