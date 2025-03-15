class Solution {
    public int removeDuplicates(int[] nums) {
        short slow=0;
        for(short fast=1;fast<nums.length;fast++)
        {
            if(nums[fast]!=nums[slow])
            {
                slow++;
                nums[slow]=nums[fast];
            }
        }
        return slow+1;
    }
}