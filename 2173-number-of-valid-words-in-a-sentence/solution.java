class Solution {
    public int countValidWords(String sentence) {
        //String r1="^[a-z]+(-?[a-z]+)?)?(!|\\.|,)?$";
        String r1 = "^([a-z]+(-?[a-z]+)?)?(!|\\.|,)?$";

        String r2="[^0-9]+";
        String arr[]=sentence.split("\\s+");
        int ans=0;
        for(String s:arr){
            if(s.matches(r1)&&s.matches(r2))ans++;
        }
        return ans;
        
    }
}
