class Solution {
    public int differenceOfSum(int[] nums) {
        int elementsum=0;
        int digitsum=0;

        for(int i=0;i<nums.length;i++){
            elementsum+=nums[i];
            if(nums[i]>=10){
                while(nums[i]!=0){
                int d=nums[i]%10;
                digitsum+=d;
                nums[i]=nums[i]/10;}
            }
            else{
                digitsum+=nums[i];
            }
        }
        return Math.abs(elementsum-digitsum);


        
    }
}
