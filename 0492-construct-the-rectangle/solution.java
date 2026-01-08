class Solution {
    public int[] constructRectangle(int area) {
        int w=0;
       int  findw=(int)Math.sqrt(area);
        while(findw>0){
        if(area%findw==0){w=findw;break;}findw--;}
        int l=area/w;
        return new int[]{l,w};


        

        
    }
}
