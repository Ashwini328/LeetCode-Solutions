class Solution {
    public int compress(char[] chars) {
        int i=0,count=0,index=0;
        char ch;
        while(i<chars.length)
        {
            ch=chars[i];
            count=0;
            while(i<chars.length && chars[i]==ch)
            {
                count++;i++;
            }
            chars[index++]=ch;
            if(count>1)
            {
                for(char c:Integer.toString(count).toCharArray())
                {
                    chars[index++]=c;
                }
            }
        }
        return index;
    }
}