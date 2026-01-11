class Solution {
    public int totalMoney(int n) {
     int ws=1;
     int today=1;
     int t=0;
     for(int day=1;day<=n;day++){
        t+=today;
        today++;
        if(day%7==0){
            ws++;
            today=ws;
        }
     }
     return t;
        
    }
}
