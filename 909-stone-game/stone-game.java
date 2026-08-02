class Solution {
    static Integer[][] dp;
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        dp=new Integer[n][n];
        int diff=checkWinner(0,n-1,piles);
        return diff>=0?true:false;
    }
    public static int checkWinner(int left,int right,int[] piles){
        if(left==right)
            return piles[left];
        if(dp[left][right]!=null)
            return dp[left][right];
        int pickLeft=piles[left]-checkWinner(left+1,right,piles);
        int pickRight=piles[right]-checkWinner(left,right-1,piles);
        return dp[left][right]= Math.max(pickLeft,pickRight);
    }
}