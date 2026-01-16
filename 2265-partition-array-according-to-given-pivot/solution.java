class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        //Arrays.sort(nums);
        int n1=nums.length;
        List<Integer> gp= new ArrayList<>();
        List<Integer> lp = new ArrayList<>();
        List<Integer> ep = new ArrayList<>();
        for(int n:nums){
            if(n>pivot)gp.add(n);
            else if(n<pivot)lp.add(n);
            else ep.add(n);

        }
        int[] ans = new int[nums.length];
        int i = 0;
         for (int x : lp) ans[i++] = x;
        for (int x : ep) ans[i++] = x;
        for (int x : gp) ans[i++] = x;
        return ans;
    }
}
