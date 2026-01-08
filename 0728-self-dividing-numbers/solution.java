class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>num=new ArrayList<>();
        for (int i=left;i<=right;i++){
            int n=i;
            boolean isdiv=true;
            while(n>0){int d=n%10;
            if(d==0||i%d!=0){
                isdiv=false;
                break;
            }
            n/=10;
            }
            if(isdiv){num.add(i);}
        }
        return num;

        
    }
}
