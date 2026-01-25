class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)return 1;
        if(n==1)return 10;
        int res=10;
        int curr=9;
        for(int i=2;i<n+1;i++){
            curr*=(10-(i-1));
            res+=curr;
        }
        return res;
        
    }
}
