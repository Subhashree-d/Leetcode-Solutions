class Solution:
    def countCommas(self, n: int) -> int:
        tc=0
        for i in range(1,n+1):
            formatted=format(i,",")
            tc+=formatted.count(',')
        return tc
    
        
