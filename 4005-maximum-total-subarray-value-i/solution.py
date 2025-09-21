class Solution:
    def maxTotalValue(self, nums: List[int], k: int) -> int:
        s = nums  
    
        max_val = max(s)
        min_val = min(s)
    
        return k * (max_val - min_val) 
