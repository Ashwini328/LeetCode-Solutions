class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length,i=0;
        int[] ans = new int[2*n];
        for(int num:nums)
        {
            ans[i]=num;
            ans[i+n]=num;
            i++;
        }
    return ans;
    }
}