class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        char[] ch=t.toCharArray();
        char[] ch2=s.toCharArray();
        while(i<ch.length && j<ch2.length)
        {
            if(ch[i]==ch2[j])
                j++;
            i++;
        
        }
        return j==ch2.length;
    }
}