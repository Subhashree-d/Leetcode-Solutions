class Solution {
    public int appendCharacters(String s, String t) {
        int s_index=0,t_index=0;
        int slen=s.length(),tlen=t.length();
        while(s_index<slen && t_index<tlen){
            if(s.charAt(s_index)==t.charAt(t_index)){
                t_index++;
            }
            s_index++;
        }
        return tlen-t_index;

        
    }
}
