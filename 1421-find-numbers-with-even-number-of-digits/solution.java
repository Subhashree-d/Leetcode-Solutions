class Solution {
    public int findNumbers(int[] nums) {
        int edc=0;
        for(int num:nums){
           int c=0;
           int temp=num;
           while(temp!=0){
            temp=temp/10;
            c++;
           }
           if(c%2==0){
            edc++;
           }
        }
        return edc;
    }
}
