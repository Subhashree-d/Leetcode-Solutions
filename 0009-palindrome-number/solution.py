class Solution:
    def isPalindrome(self, x: int) -> bool:
     if x<0:
        return False
     digits=[int(i) for i in str(x)]
     return digits==digits[::-1]
        
