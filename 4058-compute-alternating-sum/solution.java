class Solution {
    public int alternatingSum(int[] nums) {
        int add=0;

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                add+=nums[i];
                
            }
            else{
                add-=nums[i];
            }

        }
        return add;
        
    }
}
