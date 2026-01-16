class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        int p=0;
        int m=arr[(arr.length-1)/2];
        int []res=new int[k];
        while(p<k){
            if(m-arr[i]>arr[j]-m)res[p++]=arr[i++];
            else res[p++]=arr[j--];
        }
        return res;

        
    }
}
