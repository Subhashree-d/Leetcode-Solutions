class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        for(int num:nums){
            if(num>max)max=num;
            if(num<min)min=num;
        }
        while(min!=0){
            int t=min;
            min=max%min;
            max=t;
        }
        
        return max;

    }
}
