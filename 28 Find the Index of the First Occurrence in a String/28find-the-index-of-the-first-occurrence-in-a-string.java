class Solution {
    public int strStr(String haystack, String needle) {
        int i=0,j=0,s1=haystack.length(),s2=needle.length();
        char[] ch1=haystack.toCharArray();
        char[] ch2=needle.toCharArray();
        for(i=0;i<=s1-s2;i++)
        {
            j=0;
            while(j<s2 && ch1[i+j]==ch2[j])
                j++;
        
            if(j==s2)
                return i;
        }
                return -1;
    }
}