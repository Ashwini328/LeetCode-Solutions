double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int merge[nums1Size+nums2Size],i,j,n;
    int temp,temp1,temp2;
    double median;
    n=nums1Size+nums2Size;
        for(i=0;i<nums1Size;i++)
        {
            merge[i]=nums1[i];
        }    
        for(j=0;j<nums2Size;j++)
        {
            merge[i]=nums2[j];
            i++;
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(merge[i]>merge[j])
                {
                    temp=merge[i];
                    merge[i]=merge[j];
                    merge[j]=temp;
                }
            }
        }
        //index=nums1Size+nums2Size;
        if(n%2==0)
        {
            temp1=n/2-1;
            temp2=(n/2);
            double div=merge[temp1]+merge[temp2];
            median=div/2;
        }
        else
        {
            median=merge[n/2];
        }
        return median;
}