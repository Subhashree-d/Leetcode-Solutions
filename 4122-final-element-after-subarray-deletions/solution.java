class Solution {
    public int finalElement(int[] nums) {
        int n=nums.length;
        // int min=Integer.MAX_VALUE;
        // int max=Integer.MIN_VALUE;
        // for(int x:nums){
        //     min=Math.min(min,x);
        //     max=Math.max(max,x);
            
        // }
        // return (n%2==0)?max:min;
       // Arrays.sort(nums);
        return Math.max(nums[0],nums[n-1]);
        
    }
}
