class Solution {
  
        List<List<Integer>>res=new ArrayList<>();
        public List<List<Integer>>subsets(int[]nums){
            backtrack(0,new ArrayList<>(),nums);
            return res;
        }
        void backtrack(int s,List<Integer>curr,int nums[]){
            res.add(new ArrayList<>(curr));
            for(int i=s;i<nums.length;i++){
                curr.add(nums[i]);
                backtrack(i+1,curr,nums);
                curr.remove(curr.size()-1);
            }
        }
        
        
    }

