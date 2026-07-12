class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int size = s.length();
        int[] dp = new int[size + 1];

        dp[0] = 1;
        dp[1] = (s.charAt(0) != '0') ? 1 : 0;

        for (int index = 2; index <= size; index++) {
            int ind = s.charAt(index - 1) - '0';

            if (ind >= 1 && ind <= 9)
                dp[index] += dp[index - 1];

            int pair = Integer.parseInt(s.substring(index - 2, index));

            if (pair >= 10 && pair <= 26)
                dp[index] += dp[index - 2];
        }

        return dp[size];
    }
}