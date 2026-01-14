class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int res=0;
        int c=0;
        for(int n:nums){
            res+=n;
            if(res==0)c++;
        }
        return c;
        
    }
}
