class Solution {
    public int minDistance(String word1, String word2) {
         int rsize = word1.length(), csize = word2.length();
         int[][] dp = new int[rsize+1][csize+1];
         for(int col = 0;col <= csize;col++) dp[0][col] = col;
         for(int row = 0;row <= rsize;row++) dp[row][0] = row;
         for(int row = 1;row <= rsize;row++)
            for(int col = 1;col <= csize;col++)
                if(word1.charAt(row-1) == word2.charAt(col-1))
                    dp[row][col] = dp[row-1][col-1];
                else
                    dp[row][col] = 1 + Math.min(dp[row-1][col],
                    Math.min(dp[row][col-1],dp[row-1][col-1]));
        return dp[rsize][csize];
    }
}