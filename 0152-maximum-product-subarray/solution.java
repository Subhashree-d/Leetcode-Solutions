class Solution {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        for (int n : nums) {
            res = Math.max(res, n);
        }

        int curmax = 1, curmin = 1;

        for (int n : nums) {
            int temp = curmax * n;
            curmax = Math.max(temp, Math.max(curmin * n, n));
            curmin = Math.min(temp, Math.min(curmin * n, n));

            res = Math.max(res, curmax);
        }

        return res;        
    }
}
