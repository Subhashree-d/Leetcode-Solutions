class Solution:
    def minAllOneMultiple(self, k: int) -> int:
        if k%2==0 or k%5==0:
            return -1
        rem=0
        seen=set()
        for l in range(1,k+1):
            rem=(rem*10+1)%k
            if rem==0:
                return l
            if rem in seen:
                return -1
            seen.add(rem)
        return -1
        
