class Solution {
    public int[] separateDigits(int[] nums) {
        int total=0;
        for(int num:nums)
            total+=String.valueOf(num).length();

        int[] digits=new int[total];
        int index=0;
        for(int num:nums)
        {
            String str=String.valueOf(num);
            for(int i=0;i<str.length();i++)
            {
                digits[index++]=str.charAt(i)-'0';
            }
        }
        return digits;
    }
}