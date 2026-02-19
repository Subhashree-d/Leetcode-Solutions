class Solution {
    public int mostWordsFound(String[] sentences) {
        int c=0;
        int max=0;
       for(String currsentence:sentences){
        int currlen=currsentence.split(" ").length;
        if(currlen>max){
            max=currlen;
        }
       }
        return max;
        
    }
}
