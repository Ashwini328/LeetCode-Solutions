class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(char ch=0;ch<s.length();ch++){
            int rev=26-(s.charAt(ch)-'a');
            sum+=rev*(ch+1);
        }
        return sum;
    }
}