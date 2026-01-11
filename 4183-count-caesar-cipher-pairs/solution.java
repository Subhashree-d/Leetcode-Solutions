class Solution {
    public long countPairs(String[] words) {
        Map<String,Integer> map=new HashMap<>();
        for(String w:words){
            StringBuilder k=new StringBuilder();
            char b=w.charAt(0);
            for(int i=0;i<w.length();i++){
                int diff=(w.charAt(i)-b+26)%26;
                k.append(diff).append('#');
            }
            String pattern=k.toString();
            map.put(pattern,map.getOrDefault(pattern,0)+1);
        }
        long ans=0;
        for(int f:map.values()){ans+=(long)f*(f-1)/2;}
        return ans;
        
    }
}
