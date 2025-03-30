class Solution {
    public int largestAltitude(int[] gain) {
        int altitude=0,maxAltitude=0;
        for(int num:gain){
            altitude+=num;
            maxAltitude=Math.max(altitude,maxAltitude);
        }
        return maxAltitude;
    }
}