class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> list = new ArrayList<>();

        int top=0,bottom=arr.length-1;
        int left=0,right=arr[0].length-1;
        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++){
                list.add(arr[top][j]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(arr[i][right]);

            }
            right--;
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    list.add(arr[bottom][j]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(arr[i][left]);
                }
                left++;
            }
        }
        return list;

        
    }
}
