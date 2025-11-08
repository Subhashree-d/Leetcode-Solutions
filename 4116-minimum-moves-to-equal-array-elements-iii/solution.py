class Solution:
    def minMoves(self, nums: List[int]) -> int:
        maxmoves=max(nums)
        m=sum(maxmoves-num for num in nums)
        return m
