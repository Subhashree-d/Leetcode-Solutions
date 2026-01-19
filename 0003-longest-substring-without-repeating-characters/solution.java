class Solution {
    public int lengthOfLongestSubstring(String s) {
    //  int maxlen=0;
    //  String str="";
    //  for(int i=0;i<s.length();i++){
    //     for(int j=i+1;j<=s.length();j++){
    //         str=s.substring(i,j);
    //        // maxlen=str.length();
    //        if(allunique(str)){
    //         maxlen=Math.max(str.length(),maxlen);}

    //     }
    //  }
    //  return maxlen;

        
    // }

    // public boolean allunique(String str){
    //     boolean seen[]=new boolean[256];
    //     for(char c:str.toCharArray()){
    //         if(seen[c])return false;
    //         seen[c]=true;
    //     }
    //     return true;

    int left=0,maxlen=0;
    HashSet<Character>set=new HashSet<>();
    for(int right=0;right<s.length();right++){
       // char ch=s.charAt(right);
        while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left));
            left++;
        }
        set.add(s.charAt(right));

    maxlen=Math.max(maxlen,right-left+1);
    }
    return maxlen;

    }
}
