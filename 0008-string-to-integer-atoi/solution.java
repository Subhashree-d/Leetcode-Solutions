class Solution {
    public int myAtoi(String str) {
        final int len=str.length();
        if(len==0)
        {
            return 0;
        }
        int index=0;
        while(index<len && str.charAt(index)==' '){
            index++;
        }
        boolean isNeg=false;
        if(index<len)
        {
            if(str.charAt(index)=='-'){
                isNeg = true;
                index++;
            }
            else if(str.charAt(index)=='+'){
                ++index;
            }
        }
        int res=0;
        while(index<len && isDigit(str.charAt(index))){
            int digit=str.charAt(index) - '0';
            if(res > (Integer.MAX_VALUE / 10)|| (res ==(Integer.MAX_VALUE/10)&& digit > 7) ){
                return isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res=(res*10)+digit;
            index++;}
            return isNeg ? -res : res;
        }
        private boolean isDigit(char ch){
            return ch >= '0' && ch <= '9';
        }
    }

