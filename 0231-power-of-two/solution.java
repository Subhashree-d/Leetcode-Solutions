class Solution {
    public boolean isPowerOfTwo(int n) {
        long result=n;
        if(n==0)
        {
            return false;
        }

        return (result & result-1)==0;

        
        
    }
}
