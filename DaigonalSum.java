class Solution {
    public int diagonalSum(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        int sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==j){
                    sum+=mat[i][j];
                }
            }
        }
        int i=rows-1;
        int j=0;
        while(i<rows && j<cols){
           if(i!=j){
              sum+=mat[i][j];
           }
           i--;
           j++;
                    
        }
        return sum;
    }
}
