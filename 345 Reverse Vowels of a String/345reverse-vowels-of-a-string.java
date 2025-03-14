class Solution {
    public String reverseVowels(String s) {
        int len=s.length();
        char[] ch=s.toCharArray();
        int start=0,end=len-1;
        while(start<end)
        {
            if(!isVowel(ch[start]))
                start++;
            else if(!isVowel(ch[end]))
                end--;
            else
            {
                char temp;
                temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;

            }
        }
        return String.valueOf(ch);
    }
    public boolean isVowel(char ch)
    {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
}