class Solution {
    public String convert(String s, int numRows) {
        // if (numRows == 1) {
        //     return s;
        // }
        
        // StringBuilder answer = new StringBuilder();
        // int n = s.length();
        // int diff = 2 * (numRows - 1);
        // int diagonalDiff = diff;
        // int secondIndex;
        // int index;
        // for (int i = 0; i < numRows; i++) {
        //     index = i;

        //     while (index < n) {
        //         answer.append(s.charAt(index));
        //         if (i != 0 && i != numRows - 1) {
        //             diagonalDiff = diff-2*i;
        //             secondIndex = index + diagonalDiff;
                    
        //             if (secondIndex < n) {
        //                 answer.append(s.charAt(secondIndex));
        //             }
        //         }
        //         index += diff;
        //     }
        // }
        
        // return answer.toString();
        if(numRows==1 || s.length()<numRows){
            return s;
        }

        StringBuilder[]rows=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }

        int in=0;
        int st=1;
        for(char c:s.toCharArray()){
            rows[in].append(c);
            if(in==0){
                st=1;
            }
            else if(in==numRows-1){
                st=-1;
            }
            in+=st;
        }
        StringBuilder res=new StringBuilder();
        for (StringBuilder c:rows){
            res.append(c);
        }
        return res.toString();
        

        
    }
}
