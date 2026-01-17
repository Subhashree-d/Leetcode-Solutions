class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int mq=-1;
        int bestx=-1;
        int besty=-1;
        int cx=center[0];
        int cy=center[1];
        for(int i=0;i<towers.length;i++){
            int x=towers[i][0];
            int y=towers[i][1];
            int q=towers[i][2];
        

        int d=Math.abs(x-cx)+Math.abs(y-cy);
        if(d<=radius){
            if(q>mq){mq=q;
                    bestx=x;besty=y;}
            else if(q==mq){
                if(x<bestx||(x==bestx && y<besty)){
                    bestx=x;
                    besty=y;
                }
            }
            
        }
        }
        if(mq==-1)return new int[]{-1,-1};
        return new int[]{bestx,besty};
        
    }
}
