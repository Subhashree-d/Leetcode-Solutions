class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        int min=Integer.MAX_VALUE;;
        for(int n:nums){if(n%2==0){
            map.put(n,map.getOrDefault(n,0)+1);
            
            }}
            int maxf=0;
            int ans=-1;
            for(int k:map.keySet()){
                int freq=map.get(k);
                if(freq>maxf||(freq == maxf && k < ans)){
                    maxf=freq;
                    ans=k;
                }
            }

        return ans;
        


        
    }
}
