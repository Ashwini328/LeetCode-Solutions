class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] ch=s.toCharArray();
        int n=ch.length,j=n-1;
        char[] rev=new char[n];
        for(int i=0;i<n;i++)
        {
            rev[i]=ch[j--];
        }
        return new String(rev).equals(s);
    }
}