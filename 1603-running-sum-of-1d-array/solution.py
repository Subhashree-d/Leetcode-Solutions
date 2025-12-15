class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        current_sum=0
        prev_sum=0
        
        for i in range(1,len(nums)):
            nums[i]=nums[i]+nums[i-1]
        return nums

        
