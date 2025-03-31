class Solution {
    public int findPeakElement(int[] nums) {
        int large=nums[0],key=0;
        for(int num:nums)
        {
            if(num>large)
                large=num;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==large)
                key=i;
        }
        return key;
    }
}