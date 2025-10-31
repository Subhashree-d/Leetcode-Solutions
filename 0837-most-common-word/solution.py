class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        paragraph=paragraph.lower()
        p=re.findall(r"\w+",paragraph)
        banned_set=set(banned)
        valid=[word for word in p if word not in banned_set]
        counts=Counter(valid)
        return counts.most_common(1)[0][0]


