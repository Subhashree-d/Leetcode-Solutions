class Solution {
    private static final int mod = 1000000007;
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer>subarr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                subarr.add(sum);
            }
        }
        Collections.sort(subarr);
        int sum=0;
        for(int i=left-1;i<right;i++){
            sum=(sum+subarr.get(i))%mod;
        }
        return sum;
        
    }
}
