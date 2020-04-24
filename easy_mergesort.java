import java.util.*;
public class easy_mergesort {
static void merge(int[]ar,int l,int m, int r){
    //to create L[l...m] and M[m+1...r]
    int n1=m-l+1;
    int n2=r-m;
    int L[]=new int[n1];
    int M[]=new int[n2];
    for(int i=0;i<n1;i++)
        L[i]=ar[l+i];
    for(int j=0;j<n2;j++)
        M[j]=ar[m+1+j];
    int i, j, k;
    i = 0;
    j = 0;
    k = l;
    while (i < n1 && j < n2) {
        if (L[i] <= M[j]) {
          ar[k] = L[i];
          i++;
        } else {
          ar[k] = M[j];
          j++;
        }
        k++;
      }
    while (i < n1) {
        ar[k] = L[i];
        i++;
        k++;
      }
    while (j < n2) {
        ar[k] = M[j];
        j++;
        k++;
      }
    }
    static void mergesort(int ar[],int l,int r){
        if(l<r){
            int m=(l+r)/2;
            mergesort(ar, l, m);
            mergesort(ar, m + 1, r);
            // Merge the sorted subarrays
            merge(ar, l, m, r);
        }
    }
    public static void main(String[] args){
        int[]ar={12,45,67,5,4,3,242,3};
        mergesort(ar,0,ar.length-1);
    }
}