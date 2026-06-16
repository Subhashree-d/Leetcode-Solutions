class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        boolean[] a=new boolean[nums.length];
        backtrack(nums,a,new ArrayList<>(),result);
        return result;
        
    }
    private void backtrack(int[] nums,boolean[]a,List<Integer>path,List<List<Integer>>result){
        if(path.size()==nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(a[i]){
                continue;
            }
            a[i]=true;
            path.add(nums[i]);
            backtrack(nums,a,path,result);
            path.remove(path.size()-1);
            a[i]=false;

        }
    }
}
