class Solution:
    def minLength(self, nums: List[int], k: int) -> int:
        from collections import defaultdict
        freq=defaultdict(int)
        l=s=0
        ans=float('inf')
        for r in range(len(nums)):
            if freq[nums[r]]==0:
                s+=nums[r]
            freq[nums[r]]+=1
            while s>=k:
                ans=min(ans,r-l+1)
                freq[nums[l]]-=1
                if freq[nums[l]]==0:
                    s-=nums[l]
                l+=1
        return ans if ans!=float('inf') else -1
        
