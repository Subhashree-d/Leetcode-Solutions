class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(String op:operations){
            X+=44-op.charAt(1);

        }
        return X;
    }
}
