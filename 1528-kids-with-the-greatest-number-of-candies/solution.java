class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandies=0;
        for(int c:candies){
            maxcandies=Math.max(maxcandies,c);
        }
        List<Boolean>res=new ArrayList<>();
        for(int c:candies)res.add(c+extraCandies>=maxcandies);
        return res;


        
    }
}
