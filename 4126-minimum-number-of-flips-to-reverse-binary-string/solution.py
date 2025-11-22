class Solution:
    def minimumFlips(self, n: int) -> int:
        s1=bin(n)[2:]
        rev=s1[::-1]
        flip=0
        for i in range(len(s1)):
            if s1[i]!=rev[i]:
                flip+=1
        return flip
        
