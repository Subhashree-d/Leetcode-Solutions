class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int s=0;
        for(int k:map.keySet()){
            if(map.get(k)==1){
                s+=k;
            }
        }
        return s;

        
    }
}
