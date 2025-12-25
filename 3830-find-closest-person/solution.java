class Solution {
    public int findClosest(int x, int y, int z) {
        
        int res=0;
        int a=Math.abs(x-z);
        int b=Math.abs(y-z);
        res=Math.min(a,b);
        if(a==b){return 0;}
        if(res==a){
            return 1;
        }
        else if(res==b){
            return 2;
        }
    
        return 0;

    }
}
