class Solution {
    public int findDuplicate(int[] nums) {
        int num=0;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
            num=nums[i];}
            set.add(nums[i]);

        }
        return num;
        
    }
}
