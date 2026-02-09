class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] arr = new int[n];

        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                for (int j = 0; j < n; j++) {
                    arr[j] = Math.min(arr[j], Math.abs(i - j));
                }
            }
        }
        return arr;
    }
}

