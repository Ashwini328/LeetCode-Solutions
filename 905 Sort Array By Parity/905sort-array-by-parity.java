class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] result=new int[nums.length];
        int i=0,j=nums.length-1;
        for(int num:nums)
        {
            if(num%2==0)
                result[i++]=num;
            else
                result[j--]=num;
        }
        return result;
    }
}