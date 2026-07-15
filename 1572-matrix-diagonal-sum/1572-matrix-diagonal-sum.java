class Solution {
    public int diagonalSum(int[][] mat) {
        int m=mat.length;
        int sum=0;
        if(m%2==0){
            for(int i=0;i<m;i++){
                sum+=mat[i][i];
                sum+=mat[i][m-1-i];
            }
            return sum;
        }
        else{
            for(int i=0;i<m;i++){
                sum+=mat[i][i];
                sum+=mat[i][m-1-i];
            }
            sum=sum-mat[m/2][m/2];
            return sum;
        }

        
    }
}