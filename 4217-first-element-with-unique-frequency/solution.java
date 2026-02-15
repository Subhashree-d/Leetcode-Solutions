class Solution {
    public int firstUniqueFreq(int[] nums) {

        Map<Integer,Integer>freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        Map<Integer,Integer>freqcount=new HashMap<>();
        for(int f:freq.values()){
            freqcount.put(f,freqcount.getOrDefault(f,0)+1);
        }

        for(int num:nums){
            if(freqcount.get(freq.get(num))==1){
                return num;
            }
        }
        return -1;
    }
}
