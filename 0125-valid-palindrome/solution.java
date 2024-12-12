class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>=65&&ch<=90)||(ch>=97&&ch<=122)||(ch>=48&&ch<=57))
            {
                sb.append(ch);
            }
        }
        int i=0;
        int j=sb.length()-1;
        while(i<j)
        {
            char c1=sb.charAt(i);
            char c2=sb.charAt(j);
            if(c1!=c2)
            {
                return false;
            }
                i++;
                j--;
        }
            return true;
    }
}
