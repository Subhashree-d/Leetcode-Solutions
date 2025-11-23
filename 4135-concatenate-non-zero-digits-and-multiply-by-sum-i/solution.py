class Solution:
    def sumAndMultiply(self, n: int) -> int:
        stringnumber=str(n)
        stringlist=[ digit for digit in stringnumber if digit!='0']
        if stringlist:
            x=int("".join(stringlist))
        else:
            x=0
        sumdigits=sum(int(digit) for digit in stringlist)
        return x*sumdigits
        
        
