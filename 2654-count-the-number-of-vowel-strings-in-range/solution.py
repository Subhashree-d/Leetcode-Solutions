class Solution:
    def vowelStrings(self, words: List[str], left: int, right: int) -> int:
        vowels={'a','e','i','o','u'}
        c=0
        for i in range(left,right+1):
            word=words[i].lower()
            if word[0] in vowels and word[-1] in vowels:
                c+=1
        return c
