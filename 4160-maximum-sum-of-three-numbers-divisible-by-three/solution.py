class Solution:
    def maximumSum(self, nums: List[int]) -> int:
        g0,g1,g2=[],[],[] 
        for n in nums:
            if n%3==0:
                g0.append(n)
            elif n%3==1:
                g1.append(n)
            else:
                g2.append(n)
        g0.sort(reverse=True)
        g1.sort(reverse=True)
        g2.sort(reverse=True)
        ans=0
        if len(g0)>=3:
            ans=max(ans,g0[0]+g0[1]+g0[2])
        if len(g1)>=3:
            ans=max(ans,g1[0]+g1[1]+g1[2])
        if len(g2)>=3:
            ans=max(ans,g2[0]+g2[1]+g2[2])
        if g0 and g1 and g2:
            ans=max(ans,g0[0]+g1[0]+g2[0])
        return ans
            
            
            
            
