class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        while(num!=0){
            if(num%2==0){
                num=num/2;c++;
            }
            else{
                num=num-1;
                c++;
            }
        }
        return c;
        //return num==0?0:(num%2==0?1:2)+numberOfSteps(num%2==0?num/2:num-1)+1;
        
    }
}
