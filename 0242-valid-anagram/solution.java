class Solution {
    public boolean isAnagram(String s, String t) {
      s=s.toLowerCase();
      t=t.toLowerCase();
      char[] sh=s.toCharArray();
      char[] th=t.toCharArray();
    Arrays.sort(sh);
    Arrays.sort(th);
    return Arrays.equals(sh,th);

    }
}
