class Solution {
    public boolean checkString(String s) {

        // int bindex=s.indexOf('b');
        // int aindex=s.lastIndexOf('a');
        // if(aindex<bindex||bindex==-1)return true;
        // return false;
        return !s.contains("ba");

        
    }
}
