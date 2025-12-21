class Solution:
    def minCost(self, s: str, cost: List[int]) -> int:
        from collections import defaultdict
        total_cost=sum(cost)
        kc=defaultdict(int)
        for ch,c in zip(s,cost):
            kc[ch]+=c
        return total_cost-max(kc.values())
        
