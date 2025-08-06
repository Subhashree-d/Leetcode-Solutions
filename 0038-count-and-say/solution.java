class Solution {
    public String countAndSay(int n) {
         String curr = "1";
        while (--n > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < curr.length(); ) {
                char c = curr.charAt(i);
                int count = 0;
                while (i < curr.length() && curr.charAt(i) == c) {
                    i++;
                    count++;
                }
                sb.append(count).append(c);
            }
            curr = sb.toString();
        }
        return curr;
    }
}
