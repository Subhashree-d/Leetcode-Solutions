class Solution:
    def sortVowels(self, s: str) -> str:
        vowels=[]
        listt=list(s)
        for i in listt:
            if i in "AEIOUaeiou":
                vowels.append(i)
      
        if vowels== []:
            return s
        vowels.sort()
        count=0;
        for j in range(len(s)):
            if listt[j] in "AEIOUaeiou":
                listt[j] = vowels[count]
                count += 1

        return "".join(listt)
        
