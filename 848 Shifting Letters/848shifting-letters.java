class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n=s.length();
        char[] res=new char[n];
        int sum=0;

        for(int i=n-1;i>=0;i--){
            sum=(sum+shifts[i])%26;
            int newChar=(s.charAt(i)-'a' +sum)%26;
            res[i]=(char)(newChar+'a');
        }
        return new String(res);
    }
}