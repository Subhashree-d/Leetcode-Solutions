class Solution {
    public int[] rotateElements(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        for(int x:nums){
            if(x>=0){
                list.add(x);
            }
        }
        int m=list.size();
        if(m==0)return nums;
        k=k%m;
        List<Integer>rotated=new ArrayList<>();
        for(int i=0;i<m;i++){
            rotated.add(list.get((i+k)%m));
            
        }
        int in=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                nums[i]=rotated.get(in++);
            }
        }
        return nums;
        
    }
}
