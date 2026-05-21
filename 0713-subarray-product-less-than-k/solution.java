class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int subarraycount=0,left=0,product=1;;
        if(k<=0)return 0;
        for(int right=0;right<nums.length;right++){
            product*=nums[right];
            while(left<=right && product>=k){product/=nums[left];left++;}
            subarraycount+=right-left+1;

            
        }
        return subarraycount;
    }
}
