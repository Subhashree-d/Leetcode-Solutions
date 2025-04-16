class Solution {
    public String reverseVowels(String s) {
        int st=0;
        int end=s.length()-1;
        char[] ch=s.toCharArray();
        while(st<end){
            if(!"aeiouAEIOU".contains(ch[st]+"")){
                st++;
                continue;
            }
            if(!"aeiouAEIOU".contains(ch[end]+"")){
                end--;
                continue;
            }
            char t=ch[st];
            ch[st]=ch[end];
            ch[end]=t;
            st++;
            end--;
        }
       return new String(ch);


    }
}
