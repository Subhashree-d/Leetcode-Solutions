class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        int n=costs.length;
        int[][] a=new int[n][2];
        for(int i=0;i<n;i++){
    a[i][0]=costs[i];
        a[i][1]=capacity[i];}
        Arrays.sort(a,(x,y)->x[0]-y[0]);
        int[] pref=new int[n];
        pref[0]=a[0][1];
        for(int i=1;i<n;i++){
            pref[i]=Math.max(pref[i-1],a[i][1]);}
            int ans=0;
            for(int i=0;i<n;i++){
                if(a[i][0]>=budget)break;
                ans=Math.max(ans,a[i][1]);
                int rem=budget-a[i][0]-1;
                int l=0,r=i-1,idx=-1;
                while(l<=r){
                    int m=(l+r)/2;
                    if(a[m][0]<=rem){
                        idx=m;
                        l=m+1;
                    }
                    else{
                        r=m-1;
                    }
                }
                if(idx!=-1){
                    ans=Math.max(ans,a[i][1]+pref[idx]);
                }
                
                
                
               
            }
        return ans;
        
        
        
        
        
    }
}
