class Solution {
    public void sortColors(int[] nums) {
        int zeros=0;
        int ones=0;
        int two=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)zeros++;
            else if(nums[i]==1)ones++;
            else two++;
        }
        int n=zeros+ones+two;
        int arr[]=new int[n];
        for(int i=0;i<zeros;i++){arr[i]=0;}
        for(int i=zeros;i<zeros+ones;i++){arr[i]=1;}
        for(int i=zeros+ones;i<n;i++){arr[i]=2;}
        for(int i = 0; i < n; i++){
    nums[i] = arr[i];
}
        
    }
}
