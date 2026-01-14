class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String>arr=new ArrayList<>();
        for(String s:words){
            String[] parts = s.split("\\"+separator);
            for(String part:parts){
                if(!part.equals("")){
                    arr.add(part);
                }
            }

        }
        return arr;

        
    }
}
