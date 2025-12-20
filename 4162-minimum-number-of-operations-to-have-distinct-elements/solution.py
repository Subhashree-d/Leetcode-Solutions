class Solution:
    def minOperations(self, nums: List[int]) -> int:
        seen=set()
        L=len(nums)
        for i in range(len(nums) -1,-1,-1):
            if nums[i] in seen:
                break
            seen.add(nums[i])
            L=i
        return (L+2)//3
        
