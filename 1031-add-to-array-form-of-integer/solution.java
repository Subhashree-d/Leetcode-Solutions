class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        // String str="";
        // for(int i=0;i<num.length;i++){
        //     str+=num[i];
        // }
        // int n=Integer.parseInt(str);
        // int t=n+k;
        // String convert=String.valueOf(t);
        // List<Integer>list=new ArrayList<>();
        // for(int i=0;i<convert.length();i++){
        //     list.add(convert.charAt(i)-'0');
        // }
        // return list;
         List<Integer> res = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) k += num[i--];
            res.add(k % 10);
            k /= 10;
        }

        Collections.reverse(res);
        return res;
        
    }
}
