class Solution {
    public int findKthPositive(int[] arr, int k) {
        int mc=0;
        int num=1;
        int i=0;
        while(mc<k){
            if(i<arr.length && arr[i]==num){
                i++;
            }
            else{
                mc++;
            if(mc==k)return num;}num++;
        }
            return -1;
    }
}
