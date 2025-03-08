int reverse(int x){
    long long int n=x,rev=0,rem=0;
    while(n!=0)
    {
        rem=n%10;
        rev=(rev*10)+rem;
        if(rev>INT_MAX || rev<INT_MIN)
            return 0;
        n=n/10;
    }
    return rev;
}