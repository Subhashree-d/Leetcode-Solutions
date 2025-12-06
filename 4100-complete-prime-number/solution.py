class Solution:
    def isPrime(self,n:int)->bool:
        if n<2:
            return False
        if n in (2,3):
            return True
        if n%2==0:
            return False 
        i=3
        while i*i<=n:
            if n%i==0:
                return False 
            i+=2
        return True
    def completePrime(self, num: int) -> bool:
        s=str(num)
        for i in range(1,len(s)+1):
            prefix=int(s[:i])
            if not self.isPrime(prefix):
                return False

        for i in range(len(s)):
            suffix=int(s[i:])
            if not self.isPrime(suffix):
                return False 

        return True
