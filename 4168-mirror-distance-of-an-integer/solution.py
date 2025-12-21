class Solution:
    def mirrorDistance(self, n: int) -> int:
        rev=str(n)[::-1]
        irev=int(rev)
        return abs(n-irev)
        
