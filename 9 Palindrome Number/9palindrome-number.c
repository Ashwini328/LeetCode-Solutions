bool isPalindrome(int x) {
    long int rem,original=x,rev=0;
    if(x<0)
        return false;
    while(original!=0)
    {
        rem=original%10;
        rev=(rev*10)+rem; 
        original=original/10; 
    }
    return x==rev;
}