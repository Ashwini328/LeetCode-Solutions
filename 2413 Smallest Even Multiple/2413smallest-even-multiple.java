class Solution {
    public int smallestEvenMultiple(int n) {
        int num=0;
        for(int i=n;i<30*n;i++)
            if(i%2==0 && i%n==0){
                num=i;
                break;
            }
        return num;
    }
}