class Solution:
    def largestPrime(self, n: int) -> int:
        prime=[True]*(n+1)
        prime[:2]=[False,False]
        for i in range(2,int(n**0.5)+1):
            if prime[i]:
                for j in range(i*i,n+1,i):
                    prime[j]=False
        s=ans=0
        for i in range(2,n+1):
            if prime[i]:
                s+=i
                if s>n:
                    break
                if prime[s]:
                    ans=s
        return ans
