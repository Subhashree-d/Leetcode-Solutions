class Solution:
    def climbStairs(self, n: int, costs: List[int]) -> int:
        keldoniraq = costs
        dp = [float('inf')] * (n + 1)
        dp[0] = 0
        for j in range(1, n + 1):
            for step in (1, 2, 3):
                i = j - step
                if i >= 0:
                    dp[j] = min(dp[j], dp[i] + keldoniraq[j-1] + step * step)
        return dp[n]
