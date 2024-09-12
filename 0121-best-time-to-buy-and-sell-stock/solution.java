class Solution {
    public int maxProfit(int[] p) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i = 0; i < p.length; i++){
            if(p[i] < lsf){
                lsf = p[i];
            }
            pist = p[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
}
