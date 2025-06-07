class Solution {
    int maxlen=0;
    int l=0;
    public String longestPalindrome(String s) {
        char[] in=s.toCharArray();
        if(s.length()<2){
            return s;
        }

        for(int i=0;i<in.length;i++){
            ispalindrome(in,i,i);
            ispalindrome(in,i,i+1);
        }
        return s.substring(l,l+maxlen);
        
    }
    public void ispalindrome(char[]s,int j,int k){
        while(j>=0&&k<s.length&&s[j]==s[k]){
            j--;
            k++;
        }
        if(maxlen<k-j-1){
            maxlen=k-j-1;
            l=j+1;
        }
    }
}
