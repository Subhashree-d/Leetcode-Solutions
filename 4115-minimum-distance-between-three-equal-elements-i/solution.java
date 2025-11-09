class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);}
            int mindistance=Integer.MAX_VALUE;
            for(List<Integer>indices:map.values()){
                if(indices.size()>=3){
                    for(int i=0;i<=indices.size()-3;i++){
                        int a=indices.get(i);
                        int b=indices.get(i+1);
                        int c=indices.get(i+2);
                        int distance=Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a);
                        mindistance=Math.min(mindistance,distance);
                    }
                }
            }
        
        return mindistance==Integer.MAX_VALUE?-1:mindistance;
    }
}
