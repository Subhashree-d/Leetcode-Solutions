class Solution:
    def countDigits(self, num: int) -> int:
        return sum(not num % int(d) for d in str(num))
