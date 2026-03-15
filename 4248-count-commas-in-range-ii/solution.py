class Solution:
    def countCommas(self, n: int) -> int:
        answer=0
        start=1000
        commas=1
        while start<=n:
            p=start*1000-1
            c=max(0,min(n,p)-start+1)
            answer+=c*commas
            start*=1000
            commas+=1

        return answer 
        
