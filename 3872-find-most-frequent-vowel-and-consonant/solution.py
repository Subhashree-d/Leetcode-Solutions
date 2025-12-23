class Solution:
    def maxFreqSum(self, s: str) -> int:
        maxv=0
        maxc=0
        vowels=['a','e','i','o','u']
        c=0
        d_set=set(s)
        for i in d_set:
            if i in "aeiou":
                maxv=max(maxv,s.count(i))
            else:
                maxc=max(maxc,s.count(i))
        return maxv+maxc



        
