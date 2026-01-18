class Solution {
    public int integerBreak(int n) {
        if(n==2)return 1;
        if(n==3)return 2;
        int th=n/3;
        int r=n%3;
        if(r==1){
            th-=1;
            r=4;
        }
        else if(r==0){
            r=1;
        }
        return (int)(Math.pow(3,th)*r);

        
    }
}
