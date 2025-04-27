class Solution {
    public int countSubarrays(int[] nums) {
        int c=0;
        for(int i=0;i<=nums.length-3;i++){
            
            
            {
                int f=nums[i];
                int s=nums[i+1];
                int t=nums[i+2];
                if(f+t==s/2.0){
                    c++;
                }
                

                
            }
        }
        return c;
    }
}
