class Solution {
    public int maxVowels(String s, int k) {
        char[] str=s.toCharArray();
        int max=0,count=0;
        int n=str.length;
        for(int i=0;i<k;i++){
            if(isVowel(str[i])) count++;
            max=count;
        }
        for(int i=k;i<n;i++){
            if(isVowel(str[i])) count++;
            if(isVowel(str[i-k])) count--;
            max=Math.max(max,count);
        }
        return max;
    }
    boolean isVowel(char c){
       return c=='a' || c=='e' || c=='i' || c=='o' || c=='u'; 
    }
}