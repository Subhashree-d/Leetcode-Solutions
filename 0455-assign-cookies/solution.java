class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int a = s.length - 1;
        int i = g.length - 1;
        int result = 0;
        while(a>= 0 && i >= 0){
            if(g[i] <= s[a]){
                result++;
                a--;
            }
            i--;
        }
        return result;
    }
}     
