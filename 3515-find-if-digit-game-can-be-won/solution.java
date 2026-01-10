class Solution {
    public boolean canAliceWin(int[] nums) {
        int d=0;
        int sum=0;

        for(int num:nums){
            if(num<10)sum+=num;
            else if(num>=10)d+=num;
        }
        if(sum==d)return false;
        else return true;
        
        

    }
}
