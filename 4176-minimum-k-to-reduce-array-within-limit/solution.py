class Solution:
    def minimumK(self, nums: List[int]) -> int:
        n=len(nums)
        left=1
        right=max(max(nums),int(math.sqrt(n)))+2
        def ops(k):
            return sum((x+k-1)//k for x in nums)
        ans=right
        while left<=right:
            mid=(left+right)//2
            if ops(mid)<=mid*mid:
                ans=mid
                right=mid-1
            else:
                left=mid+1
        return ans
    
        
