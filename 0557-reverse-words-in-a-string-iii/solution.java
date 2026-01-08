class Solution {
    public String reverseWords(String s) {
        int n=s.length()-1;
        String arr[]=new String[n];
        String re="";
        arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            StringBuilder sb=new StringBuilder(arr[i]);
            re+=sb.reverse().toString();
            if(i<arr.length-1) re+=" ";
        }
        return re;
        
    
    }
}
