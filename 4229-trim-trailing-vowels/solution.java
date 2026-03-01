class Solution {
    public String trimTrailingVowels(String s) {
        String str="";
        int c=0;
        int ind=s.length();

        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);;
            
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                ind=i;
                
                
                
            }
            else{break;}

            
        }
        return s.substring(0,ind);
        
    }
}
