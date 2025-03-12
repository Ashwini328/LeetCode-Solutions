class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> result = new ArrayList<>();
        int maxCandy = 0;
        for (int candy : candies) {
            maxCandy = Math.max(maxCandy, candy);
        }
        for (int i = 0; i < n; i++) {
            result.add(candies[i] + extraCandies >= maxCandy);
        }

        return result;
        
    }
}