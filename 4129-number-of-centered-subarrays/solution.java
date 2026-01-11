class Solution {
    public int centeredSubarrays(int[] nums) {
        int c=0;
        
        for (int i=0;i<nums.length;i++){
             int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                
                for(int k=i;k<=j;k++){
                    if(nums[k]==sum){c++;break;}
                    
                }
                
            }
        }
        return c;
        
    }
}
