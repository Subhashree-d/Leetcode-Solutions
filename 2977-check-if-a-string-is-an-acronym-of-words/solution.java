class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String rw="";

        for(String w:words){
            rw+=w.charAt(0);

        }
        return rw.equals(s);



        
    }
}
