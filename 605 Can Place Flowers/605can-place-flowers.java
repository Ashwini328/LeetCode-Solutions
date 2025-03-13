class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i=0,count=0,len=flowerbed.length;
        for(i=0;i<len;i++)
        {
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&  
                (i == len - 1 || flowerbed[i + 1] == 0))
            {
                count++;
                flowerbed[i]=1;
            
            if(count>=n)
                return true;
            i++;
            }
        }
        return count>=n;
    }
}