class Solution {
    public int minPairSum(int[] nums) {

        Arrays.sort(nums);
        int p=0;
        int n=nums.length;
        int max=0;
        for(int i=0;i<nums.length/2;i++){
            int pairsum=nums[i]+nums[n-1-i];
            max=Math.max(pairsum,max);
           


        }
        return max;
        
        
    }
}
