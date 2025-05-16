class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean arr[]=new boolean[26];
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if(ch>='a'&&ch<='z'){
                arr[ch-'a']=true;
            }
        }
        for(int i=0;i<26;i++){
            if(!arr[i]){return false;}
        }
        return true;
        // boolean flag=false;
        // if(sentence.equals("abcdefghijklmnopqrstuvwxyz")){
        //    flag=true;
        // }
        // return flag;
    }
}
