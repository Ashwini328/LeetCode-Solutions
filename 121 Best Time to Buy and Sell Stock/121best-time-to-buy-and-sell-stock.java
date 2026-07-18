class Solution {
    public int maxProfit(int[] prices) {
        int smallest=prices[0],largest=prices[0],profit=0;
        for(int num:prices){
            if(num<smallest){
                smallest=num;
                largest=num;
            }
            else if(num>largest){
                largest=num;
                profit=Math.max(profit,largest-smallest);
            }
        }
        return profit;
    }
}