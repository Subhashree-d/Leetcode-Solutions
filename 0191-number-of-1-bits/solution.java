class Solution {
    public int hammingWeight(int n) {
       String b=Integer.toBinaryString(n);
       int c=0;
       for(int i=0;i<b.length();i++){
        char ch=b.charAt(i);
        if(ch=='1'){
            c++;
        }
       } 
       return c;
    }
}
