class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        nums.sort()
        f=set(range(nums[0],nums[-1]+1))
        return sorted(list(f-set(nums)))
