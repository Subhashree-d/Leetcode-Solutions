class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            rankMap.put(score[i], i);
        }

        Arrays.sort(score);
        String[] medals = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        String[] result = new String[score.length];

        for (int i = score.length - 1; i >= 0; i--) {
            if (i >= score.length - 3) {
                result[rankMap.get(score[i])] = medals[score.length - 1 - i];
            } else {
                result[rankMap.get(score[i])] = String.valueOf(score.length - i);
            }
        }

        return result;
    }
}
