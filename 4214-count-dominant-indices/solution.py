class Solution:
    def dominantIndices(self, nums: List[int]) -> int:
        ts=sum(nums)
        dc=0
        n=len(nums)
        for i in range(n-1):
            ts-=nums[i]
            re=n-1-i
            if nums[i]*re>ts:
                dc+=1
        return dc
        
