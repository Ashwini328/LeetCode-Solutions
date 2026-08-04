class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
            set.add(num);
        for(int i=min+1;i<max;i++){
            if(!set.contains(i))
                res.add(i);
        }
        return res;
    }
}