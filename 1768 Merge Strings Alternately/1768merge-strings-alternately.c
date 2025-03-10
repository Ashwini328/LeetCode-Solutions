

char * mergeAlternately(char * word1, char * word2){
    int len1=strlen(word1),len2=strlen(word2);
    char *merged=(char*)malloc((len1+len2+1)*sizeof(char));
    int i=0,j=0,k=0;
    while(word1[i]!='\0' && word2[i]!='\0')
    {
        merged[k++]=word1[i++];
        merged[k++]=word2[j++];
    }
    while(word1[i]!='\0')
        merged[k++]=word1[i++];
    while(word2[j]!='\0')
        merged[k++]=word2[j++];
    merged[k]='\0';
    return merged;
}