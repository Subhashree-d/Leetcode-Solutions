class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0; i<k; i++){
            int min = Integer.MAX_VALUE;
            int pos = 0;
            for(int j=0; j<nums.length; j++){
                if(min > nums[j]){
                    min = nums[j];
                    pos = j;
                }
            }
            nums[pos] *= multiplier;
        }

        return nums;
        
    }
}
