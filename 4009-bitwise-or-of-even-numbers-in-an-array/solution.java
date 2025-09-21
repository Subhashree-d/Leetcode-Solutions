class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
       // arr[]=new int[nums.length];
        int res=0;
       for (int i=0;i<nums.length;i++){
           if(nums[i]%2==0){
               res|=nums[i];
               
           }
       } 
       
        return res;
    }
}
