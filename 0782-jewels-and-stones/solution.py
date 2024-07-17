class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        r=0
        for i in stones:
            if i in jewels:
                  r=r+1
        return r
