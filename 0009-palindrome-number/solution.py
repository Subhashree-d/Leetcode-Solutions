class Solution:
    def isPalindrome(self, x: int) -> bool:
     if x<0:
        return False
     digit=[int(i) for i in str(x) ]
     return digit==digit[::-1]
        
