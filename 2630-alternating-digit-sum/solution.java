class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        int sign=1;

for(char c:String.valueOf(n).toCharArray()){
    sum+=sign*(c-'0');
    sign=-sign;
}

    return sum;    
    }
}
