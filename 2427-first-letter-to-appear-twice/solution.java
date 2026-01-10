class Solution {
    public char repeatedCharacter(String s) {
        int c=0;
        Set<Character> st=new HashSet<>();
        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);
            if(!st.add(ch)) return ch;
  
        }
       return 'h';
    }
}
