class Solution {
    private int func(int i , int j , int [][] dp ){
        //Base
        if(i==0&& j==0) return 1;
        //out of bounds 
        if(i<0||j<0) return 0;
        //if already visited
        if(dp[i][j]!=-1) return dp[i][j];

        //Recursive call from left up and left moves
        int up = func(i-1,j ,dp);
        int left = func(i, j-1, dp);

        //store the result return
        return dp[i][j]=up+left;

    }
    //funtion to calculate total unique path
    public int uniquePaths(int m, int n) {
        //Dp array initalized with -1
        int [][] dp = new int[m][n];
        for(int[]row: dp){
            Arrays.fill(row,-1);
        }
        return func(m-1, n-1, dp);
        
    }
}