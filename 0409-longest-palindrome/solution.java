class Solution {
    public int longestPalindrome(String s) {
         int[] letters = new int[71];
        int length = 0;
        for (char ch: s.toCharArray()){
                letters[ch-'A']++;}
            for (int i = 0; i < 71; i++) {
                length += letters[i] & ~1;
        }
        
        return Math.min(s.length(), length+1);
    }
}
