class Solution {
    long reverse=0;
    public int reversepair(int[] array){
        mergesort(array,0,array.length-1);
        return (int)reverse;
    }

    public void mergesort(int[] array, int left, int right){
        

        if(left>=right){
            return ;
        }

        int mid = left + (right-left)/2;

        mergesort(array,left,mid);
        mergesort(array,mid+1,right);
        merge(array,left,mid,right);
    }
    public void merge(int[] array, int left, int mid, int right){
        int n = mid-left+1;
        int m = right-mid;

        int[] larr = new int[n];
        int[] rarr = new int[m];

        for(int i=0;i<n;i++){
            larr[i]=array[i+left];
        }

        for(int i=0;i<m;i++){
            rarr[i]=array[mid+1+i];
        }

        int j = 0;
        for(int i=0;i<n;i++){
            
            while(j<m && larr[i]>2L * rarr[j]){
                
                j++;
            }
            reverse+=j;

        }


        int i=0;
        j=0;
        int k=left;

        while(i<n && j<m){
            if(larr[i]>rarr[j]){
                array[k]=rarr[j];
                j++;
                
            }
            else{
                array[k]=larr[i];
                i++;
            }
            k++;
        }

        while(j<m){
            array[k]=rarr[j];
            j++;
            k++;
        }

        while(i<n){
            array[k]=larr[i];
            i++;
            k++;
        }

    }
    public int reversePairs(int[] nums) {
        return reversepair(nums);
    }
}