char nextGreatestLetter(char* letters, int lettersSize, char target) {
    int mid,low=0,high=lettersSize-1;
    while(low<=high)
    {
        mid=(low+high)/2;
        if(letters[mid]>target)
            high=mid-1;
        else
            low=mid+1;
    }
    return letters[low%lettersSize];
   
}