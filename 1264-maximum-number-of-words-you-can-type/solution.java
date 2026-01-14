class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        String[] s=text.split(" ");
        int c=0;
        for(String str:s){
            boolean cantype=true;
            for(int j=0;j<brokenLetters.length();j++){
                char ch=brokenLetters.charAt(j);
            
            if(str.indexOf(ch)!=-1){
                cantype=false;
                break;

            }
            }
            if(cantype)c++;
        }
        return c;

        
    }
}
