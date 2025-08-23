class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0,max=0;
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                k--;
            count++;
            while(k<0){
                if(nums[left]==0)
                    k++;
                count--;
                left++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}