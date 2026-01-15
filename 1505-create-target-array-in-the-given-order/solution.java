class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int arr[]=new int[nums.length];
        ArrayList<Integer>a=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            a.add(index[i],nums[i]);
            
        }
        for(int i=0;i<nums.length;i++){
            arr[i]=a.get(i);
        }
        return arr;


        
    }
}
