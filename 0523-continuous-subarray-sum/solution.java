class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        // int sum=0;
        //     for(int j=i;j<n;j++){
        //       int len=j-i+1;
        //       sum+=nums[j];
        //       if(len>=2 && sum%k==0){
        //         return true;

        //       }
        //     }
        // }
        // return false;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(map.containsKey(rem)){
                if(i-map.get(rem)>=2){
                    return true;
                }}
                else{
                    map.put(rem,i);
                }
            
        }
        return false;

    }
}
