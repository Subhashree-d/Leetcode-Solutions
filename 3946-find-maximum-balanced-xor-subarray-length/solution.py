class Solution:
    def maxBalancedSubarray(self, nums: List[int]) -> int:
        seen={(0,0):-1}
        xor=0
        even=0
        odd=0
        max_len=0
        for i,num in enumerate(nums):
            xor^=num
            if num%2==0:
                even+=1
            else:
                odd+=1
            key=(xor,even-odd)
            if key in seen:
                max_len=max(max_len,i-seen[key])
            else:
                seen[key]=i
        return max_len
