class Solution {
    public boolean predictTheWinner(int[] nums) {
        int diff=winner(0,nums.length-1,nums);
        if(diff>=0)
            return true;
        else
            return false;
    }
    public static int winner(int left,int right,int[] nums){
        if(left==right)
            return nums[left];
        int pickLeft=nums[left]-winner(left+1,right,nums);
        int pickRight=nums[right]-winner(left,right-1,nums);
        return Math.max(pickLeft,pickRight);
    }
}