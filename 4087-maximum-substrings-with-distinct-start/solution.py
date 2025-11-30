class Solution:
    def maxDistinct(self, s: str) -> int:
        use=set()
        c=0
        for i in s:
            if i not in use:
                use.add(i)
                c+=1 
        return c
