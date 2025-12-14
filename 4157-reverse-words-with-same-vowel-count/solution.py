class Solution:
    def reverseWords(self, s: str) -> str:
        vowels=set("aeiou")
        words=s.split()
        fc=sum(1 for c in words[0] if c in vowels)
        for i in range(1,len(words)):
            count=sum(1 for c in words[i] if c in vowels)
            if count==fc:
                words[i]=words[i][::-1]

        return " ".join(words)
