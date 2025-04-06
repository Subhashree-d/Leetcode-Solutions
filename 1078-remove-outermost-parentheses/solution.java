class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res= new StringBuilder();
        int depth=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(depth>0){
                    res.append(ch);
                }
                depth++;

            }
            else if(ch==')'){
                depth--;
                if(depth>0){
                    res.append(ch);

                }

            }
            
        }
        return res.toString();
    }
}
