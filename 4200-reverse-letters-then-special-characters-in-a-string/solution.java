class Solution {
    public String reverseByType(String s) {
        List<Character> letter=new ArrayList<>();
        List<Character> special=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(c>='a' && c<='z'){
                letter.add(c);
            }
            else{
                special.add(c);
            }
        }
        Collections.reverse(letter);
        
        Collections.reverse(special);
        StringBuilder res=new StringBuilder();
        int l=0,sp=0;
        for(char c:s.toCharArray()){
            if(c>='a' && c<='z'){
                res.append(letter.get(l++));
            }
            else{
                res.append(special.get(sp++));
            }
        }
        return res.toString();
        
    }
}
