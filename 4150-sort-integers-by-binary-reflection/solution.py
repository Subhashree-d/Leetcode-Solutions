class Solution:
    def sortByReflection(self, nums: List[int]) -> List[int]:
        def r(x):
            b=bin(x)[2:]
            rb=b[::-1]
            return int(rb,2)
        return sorted(nums,key=lambda x:(r(x),x))
