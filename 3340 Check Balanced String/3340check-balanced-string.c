bool isBalanced(char* num) {
    int i,sumEven=0,sumOdd=0;
    int len=strlen(num);
    for(i=0;i<len;i+=2)
        sumEven+=num[i]-'0';
    for(i=1;i<len;i+=2)
        sumOdd+=num[i]-'0';
    return sumEven==sumOdd;
}