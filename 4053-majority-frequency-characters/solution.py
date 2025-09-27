class Solution:
    def majorityFrequencyGroup(self, s: str) -> str:
       groups = defaultdict(list)
       for ch, f in Counter(s).items():
         groups[f].append(ch)
       best = max(groups.items(), key=lambda x: (len(x[1]), x[0]))
       return ''.join(best[1])
 
