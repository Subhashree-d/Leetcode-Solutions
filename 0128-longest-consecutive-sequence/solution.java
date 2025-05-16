class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int ls=0;

        for(int num:set){
            if(!set.contains(num-1)){
                int currnum=num;
                int currstreak=1;
            while(set.contains(currnum+1)){
                currnum++;
                currstreak++;
            }
            ls=Math.max(ls,currstreak);
            }

        }
        return ls;

    }
}
