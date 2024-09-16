import java.util.HashSet;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set= new HashSet<>();
        HashSet<Integer> intersectionset= new HashSet<>();
        for(int num:nums1)
        {
            set.add(num);
        }
        for(int num:nums2)
        {
            if(set.contains(num))
            {
                intersectionset.add(num);
            }
        }
        int[] res=new int[intersectionset.size()];
        int index=0;
        for (int num : intersectionset) {
            res[index++] = num;
        }
        
        return res;
    }
}
