class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();
        for(String w:word1){
            str1.append(w);
        }
        for(String w:word2){
            str2.append(w);
        }
        String s1=str1.toString();
        String s2=str2.toString();
        if(s1.equals(s2)){return true;}
        else{return false;}


        
    }
}
