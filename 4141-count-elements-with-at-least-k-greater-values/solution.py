class Solution:
    def countElements(self, nums: List[int], k: int) -> int:
        nums.sort()
        n=len(nums)
        ans=0 
        
        if k==0:
            return n
        if k>n:
            return 0 
        t=nums[n-k]
        for x in nums:
            if x<t:
                ans+=1 
        return ans
            
