class Solution {
    public int findLucky(int[] arr) {

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int res=-1;
        for(int k:map.keySet()){
            if(map.get(k)==k)res=Math.max(res,k);
        }
        return res;
        
    }
}
