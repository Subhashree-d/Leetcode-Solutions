class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;

        int arr1[]=new int[n/2];
        int arr2[]=new int[n/2];
         int p = 0, q = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                arr1[p++] = nums[i];
            } else {
                arr2[q++] = nums[i];
            }
        }
        int arr3[]=new int[arr1.length+arr2.length];
        int j=0;
        for(int i=0;i<arr1.length;i++){
            arr3[j++]=arr1[i];
            arr3[j++]=arr2[i];

        }
        return arr3;

        
    }
}
