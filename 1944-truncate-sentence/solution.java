class Solution {
    public String truncateSentence(String s, int k) {
        int len=s.length();
        String arr[]=s.split(" ");
        StringBuilder res=new StringBuilder();
        for (int i=0;i<k && i<arr.length;i++){
            res.append(arr[i]).append(" ");
            
        }
       return res.toString().trim();

      

    }
}
