class Solution {
    public boolean isHappy(int n) {
        return happy(n);
    }
    boolean happy(int n)
    {
        int slow=n,fast=n;
        do
        {
            slow=sumOfSquares(slow);
            fast=sumOfSquares(sumOfSquares(fast));
            if(fast==1)
                return true;
        }while(slow!=fast);
        return false;
    }
    int sumOfSquares(int n)
    {
        int sum=0,digit;
        while(n>0)
        {
            digit=n%10;
            sum+=digit*digit;
            n=n/10;
        }
        return sum;
    }
}